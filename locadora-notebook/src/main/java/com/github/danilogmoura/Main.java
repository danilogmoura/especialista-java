package com.github.danilogmoura;

import com.github.danilogmoura.locadora.Locacao;
import com.github.danilogmoura.locadora.Notebook;
import com.github.danilogmoura.locadora.PrecificacaoPorDia;
import com.github.danilogmoura.locadora.SeguroItau;

public class Main {

    public static void main(String[] args) {
        var notebook = new Notebook("Macbook Pro i7 16bg", 5, 100);
        var precificacao = new PrecificacaoPorDia();
        var seguro = new SeguroItau();

        var locacao = new Locacao(notebook, precificacao, seguro);
        double valorDevido = locacao.calcularValorDevido(10);
        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }
}
