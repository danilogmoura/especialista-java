package com.github.danilogmoura.estoque;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MainInstanciaParticular {

    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 11));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("21.1"), 10, Produto.Status.INATIVO));

//        var inativacaoProduto = new ServicoInativacaoProduto();

//        produtos.forEach(produto -> inativacaoProduto.processar(produto));
        produtos.forEach(ServicoInativacaoProduto::processar);
        produtos.forEach(System.out::println);
    }
}
