package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        for (Produto produto : produtos) {
//            produto.ativar();
//            System.out.println(produto);
//        }

//        Stream<Produto> stream = produtos.stream();
//        stream.forEach(produto -> {
//            System.out.println("Ativando " + produto);
//            produto.ativar();
//        });

//        Stream<Produto> stream = produtos.stream();
//        Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);
//        Stream<Produto> streamComEstoqueInativo = streamComEstoque.filter(Produto::isInativo);
//        streamComEstoqueInativo.forEach(produto -> {
//            System.out.println("Ativando " + produto);
//            produto.ativar();
//        });

        produtos.stream()
                .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
                .filter(Produto::temEstoque)
                .peek(System.out::println)
                .filter(Produto::isInativo)
                .forEach(produto -> {
                    System.out.println("Ativando " + produto);
                    produto.ativar();
                });
    }
}
