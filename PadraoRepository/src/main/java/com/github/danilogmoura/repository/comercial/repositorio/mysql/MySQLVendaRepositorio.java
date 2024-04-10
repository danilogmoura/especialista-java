package com.github.danilogmoura.repository.comercial.repositorio.mysql;

import com.github.danilogmoura.repository.comercial.entidade.Venda;
import com.github.danilogmoura.repository.comercial.repositorio.PersistenciaException;
import com.github.danilogmoura.repository.comercial.repositorio.VendaRepositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLVendaRepositorio implements VendaRepositorio {

    private final Connection conexao;

    public MySQLVendaRepositorio(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public Venda adicionar(Venda venda) {
        String dml = """
                INSERT INTO venda (
                    nome_cliente,
                    valor_total,
                    data_pagamento
                ) values (?, ?, ?)
                """;

        try (var comando = conexao.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS)) {
            comando.setString(1, venda.getNomeCliente());
            comando.setBigDecimal(2, venda.getValorTotal());
            comando.setDate(3, Date.valueOf(venda.getDataPagamento()));
            comando.executeUpdate();

            var codigoGeradoResultSet = comando.getGeneratedKeys();
            codigoGeradoResultSet.next();
            var codigoGerado = codigoGeradoResultSet.getLong(1);

            return new Venda(codigoGerado, venda.getNomeCliente(), venda.getValorTotal(), venda.getDataPagamento());
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }

    @Override
    public List<Venda> consultar() {
        var vendas = new ArrayList<Venda>();
        try (var comando = conexao.createStatement();
             var resultado = comando.executeQuery("SELECT v.* FROM venda v")) {

            while (resultado.next()) {
                vendas.add(new Venda(
                        resultado.getLong("id"),
                        resultado.getString("nome_cliente"),
                        resultado.getBigDecimal("valor_total"),
                        resultado.getDate("data_pagamento").toLocalDate()));
            }

            return vendas;
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }
}
