package com.github.danilogmoura.rh;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.println();
        System.out.printf("Nome: %s%n", this.nome());
        System.out.printf("Mês/Ano: %s%n", this.mesAno());
        System.out.printf("Salário: %.2f%n", this.valorSalario());
    }
}
