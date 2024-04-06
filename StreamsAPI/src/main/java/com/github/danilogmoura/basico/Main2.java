package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Optional<Produto> produtoOptional = produtos.stream()
                                                    .peek(System.out::println)
                                                    .filter(Produto::temEstoque)
                                                    .filter(Produto::isInativo)
                                                    .findAny();

        System.out.println("--------");

        Produto produto = produtoOptional.orElseThrow(
                () -> new RuntimeException("Produto não encontrado")
        );
        System.out.println(produto);
    }
}
