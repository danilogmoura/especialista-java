package com.github.danilogmoura.Desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), Funcionario.Status.ATIVO));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), Funcionario.Status.ATIVO));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), Funcionario.Status.ATIVO));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), Funcionario.Status.INATIVO));

        // TODO remover funcionários inativos
        funcionarios.removeIf(Funcionario::isInativo);

        // TODO ordenar funcionários pelo valor do salário
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        // TODO iterar e imprimir funcionários usando o método estático imprimir
        funcionarios.forEach(Main::imprimir);
    }

    private static void imprimir(Funcionario funcionario) {
        // implementar a impressão do nome, salário e impostos (20%)
        System.out.printf("Nome: %s - Salário: %s - Impostos: %s%n",
                funcionario.getNome(), funcionario.getSalario(),
                funcionario.getSalario().multiply(new BigDecimal("0.20")));
    }

}
