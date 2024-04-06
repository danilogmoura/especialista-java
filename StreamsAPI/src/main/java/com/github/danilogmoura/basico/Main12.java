package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Main12 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
//        List<Produto> produtos = cadastroProduto.obterTodos();
        List<Produto> produtos = new ArrayList<>();

//        int maiorQuantidade = produtos.stream()
//                                   .mapToInt(Produto::getQuantidade)
//                                   .reduce(0, Integer::max);
//        System.out.println(maiorQuantidade);

        OptionalInt maiorQuantidadeOptinal = produtos.stream()
                                                     .mapToInt(Produto::getQuantidade)
                                                     .reduce(Integer::max);
        int maiorQuantidade = maiorQuantidadeOptinal.orElseThrow(() -> new RuntimeException("Quantidade não encontrada"));
        System.out.println(maiorQuantidade);
    }
}
