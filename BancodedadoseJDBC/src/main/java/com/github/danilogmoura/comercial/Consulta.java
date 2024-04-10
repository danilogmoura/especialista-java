package com.github.danilogmoura.comercial;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consulta {

    private static final Logger logger = Logger.getLogger(Consulta.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pesquisa por nome: ");
        var nomePesquisa = scanner.nextLine();

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/comercial", "root", "demo");
             PreparedStatement comando = connection.prepareStatement("SELECT * FROM venda WHERE nome_cliente LIKE ?")
        ) {
            comando.setString(1, "%" + nomePesquisa + "%");
            ResultSet resultado = comando.executeQuery();

            while (resultado.next()) {
                long id = resultado.getLong("id");
                String nomeCliente = resultado.getString("nome_cliente");
                BigDecimal valorTotal = resultado.getBigDecimal("valor_total");
                Date dataPagamento = resultado.getDate("data_pagamento");

                System.out.printf("%d - %s - R$%.2f - %s%n", id, nomeCliente, valorTotal, dataPagamento);
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro de banco de dados", e);
        }
    }
}