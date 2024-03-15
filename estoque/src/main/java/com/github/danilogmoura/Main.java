package com.github.danilogmoura;

import com.github.danilogmoura.estoque.Produto;

public class Main {

    public static void main(String[] args) {
        var produto = new Produto("Apple Watch");
        produto.adicionaEstoque(10);
        produto.ativar();

        produto.retirarQuantidade(15);

        System.out.printf("Estoque %d%n", produto.getQuantidadeEstoque());
    }
}
