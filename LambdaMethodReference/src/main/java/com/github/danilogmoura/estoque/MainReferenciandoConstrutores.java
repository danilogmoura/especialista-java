package com.github.danilogmoura.estoque;

import java.util.function.Function;

public class MainReferenciandoConstrutores {

    public static void main(String[] args) {

//        Function<String, Produto> produtoFunction = nome -> new Produto(nome);
        Function<String, Produto> produtoFunction = Produto::new;
        var produto = produtoFunction.apply("Arroz");
        System.out.println(produto);
    }
}
