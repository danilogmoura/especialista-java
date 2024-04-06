package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;

public class Main8 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        Stream<Set<Categoria>> stream = produtos.stream()
//                                                .filter(Produto::temEstoque)
//                                                .map(Produto::getCategorias);
//        stream.forEach(obj -> System.out.println(obj.getClass().getName() + " - " + obj));
//        stream.forEach(obj -> obj.stream().forEach(System.out::println));

//        Stream<Stream<Categoria>> stream = produtos.stream()
//                                                   .filter(Produto::temEstoque)
//                                                   .map(produto -> produto.getCategorias().stream());
//        stream.forEach(obj -> System.out.println(obj.getClass().getName() + " - " + obj));
//        stream.forEach(obj -> obj.forEach(System.out::println));

//        Stream<Categoria> stream = produtos.stream()
//                                           .filter(Produto::temEstoque)
//                                           .flatMap(produto -> produto.getCategorias().stream())
//                                           .distinct();
//        stream.forEach(obj -> System.out.println(obj.getClass().getName() + " - " + obj));

        produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .forEach(System.out::println);
    }
}
