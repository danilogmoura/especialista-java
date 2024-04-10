package com.github.danilogmoura.comercial;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cadastro {

    private static final Logger logger = Logger.getLogger(Cadastro.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dml = """
                INSERT INTO venda (
                    nome_cliente,
                    valor_total,
                    data_pagamento
                ) values (?, ?, ?)
                """;

        try (Connection conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/comercial", "root", "demo");
             PreparedStatement comando = conexao.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS)) {
            conexao.setAutoCommit(false);
            try {
                do {
                    System.out.print("Nome: ");
                    var nome = scanner.nextLine();

                    System.out.print("Valor total: ");
                    BigDecimal valorTotal = new BigDecimal(scanner.nextLine());

                    System.out.print("Data de pagamento: ");
                    LocalDate dataPagamento = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    comando.setString(1, nome);
                    comando.setBigDecimal(2, valorTotal);
                    comando.setDate(3, Date.valueOf(dataPagamento));
                    comando.executeUpdate();

                    ResultSet codigoResultSet = comando.getGeneratedKeys();
                    codigoResultSet.next();
                    long codigoGerado = codigoResultSet.getLong(1);
                    logger.log(Level.INFO, "Venda cadastrada com código {0}", codigoGerado);
                    System.out.print("Continuar? ");
                } while ("sim".equalsIgnoreCase(scanner.nextLine()));
                conexao.commit();
            } catch (SQLException e) {
                conexao.rollback();
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro cadastrando venda", e);
        }
    }
}
