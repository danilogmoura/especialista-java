package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Categoria;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main15 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .flatMap(produto -> produto.getCategorias().stream())
//                .distinct()
//                .forEach(System.out::println);

//        List<Categoria> categorias = produtos.stream()
//                                             .filter(Produto::temEstoque)
//                                             .flatMap(produto -> produto.getCategorias().stream())
//                                             .distinct()
//                                             .collect(() -> new ArrayList<>(),
//                                                     (lista, elemento) -> lista.add(elemento),
//                                                     (lista1, lista2) -> lista1.addAll(lista2)
//                                             );
//        categorias.stream().forEach(System.out::println);

        List<Categoria> categorias = produtos.stream()
                                             .filter(Produto::temEstoque)
                                             .flatMap(produto -> produto.getCategorias().stream())
                                             .distinct()
                                             .collect(ArrayList::new, List::add, List::addAll);
        System.out.println(categorias);
    }
}
