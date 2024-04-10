package com.github.danilogmoura.repository.comercial.repositorio.mysql;

import com.github.danilogmoura.repository.comercial.repositorio.FabricaDeDepositorio;
import com.github.danilogmoura.repository.comercial.repositorio.PersistenciaException;
import com.github.danilogmoura.repository.comercial.repositorio.VendaRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLFabricaDeDepositorio implements FabricaDeDepositorio {

    private final Connection conexao;

    public MySQLFabricaDeDepositorio(Properties properties) {
        try {
            this.conexao = DriverManager.getConnection(
                    properties.getProperty("conexao.url"),
                    properties.getProperty("conexao.usuario"),
                    properties.getProperty("conexao.senha"));
        } catch (SQLException e) {
            throw new PersistenciaException("Erro ao estabelecer conexão", e);
        }
    }

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MySQLVendaRepositorio(conexao);
    }

    @Override
    public void close() {
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }
}
