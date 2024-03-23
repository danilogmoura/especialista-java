package com.github.danilogmoura.estoque;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PredicateExemplo {

    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 11));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("21.1"), 10, Produto.Status.INATIVO));


//        Iterator<Produto> produtosIterator = produtos.iterator();
//        while (produtosIterator.hasNext()) {
//            var produto = produtosIterator.next();
//            if (produto.getQuantidade() < 1) {
//                produtosIterator.remove();
//            }
//        }

        produtos.removeIf(produto -> produto.getQuantidade() < 1);

//        Predicate<Produto> predicateSemEstoque = produto -> produto.getQuantidade() < 1;
//        Predicate<Produto> predicateInativo = Produto::isInativo;

//        produtos.removeIf(predicateSemEstoque.or(predicateInativo));
//        produtos.removeIf(predicateSemEstoque.negate());
//        produtos.removeIf(Predicate.not(predicateSemEstoque));
//        produtos.removeIf(Predicate.not(produto -> produto.getQuantidade() < 1));
//        produtos.removeIf(produto -> produto.getQuantidade() > 0);


        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
