package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main21 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        Map<String, List<Produto>> estoqueProdutos = produtos.stream()
//                                                             .collect(groupingBy(produto -> produto.getFabricante().nome()));
//        estoqueProdutos.forEach((chave, valor) -> {
//            System.out.println();
//            System.out.println(chave);
//            System.out.println("----------");
//            valor.stream().forEach(System.out::println);
//        });

        Map<Boolean, List<Produto>> estoqueProdutos = produtos.stream()
                                                              .collect(Collectors.partitioningBy(Produto::temEstoque));
        estoqueProdutos.forEach((chave, valor) -> {
            System.out.println();
            System.out.println(chave);
            System.out.println("----------");
            valor.stream().forEach(System.out::println);
        });
    }
}
