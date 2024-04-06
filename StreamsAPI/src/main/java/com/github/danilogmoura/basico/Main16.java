package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Categoria;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class Main16 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        List<Categoria> categorias = produtos.stream()
//                                             .filter(Produto::temEstoque)
//                                             .flatMap(produto -> produto.getCategorias().stream())
//                                             .distinct()
//                                             .collect(ArrayList::new, List::add, List::addAll);
//        System.out.println(categorias);

//        List<Categoria> categorias = produtos.stream()
//                                             .filter(Produto::temEstoque)
//                                             .flatMap(produto -> produto.getCategorias().stream())
//                                             .distinct()
//                                             .collect(toList());
//        System.out.println(categorias);

        List<Categoria> categorias = produtos.stream()
                                             .filter(Produto::temEstoque)
                                             .flatMap(produto -> produto.getCategorias().stream())
                                             .distinct()
                                             .collect(toCollection(ArrayList::new));
        System.out.println(categorias);
    }
}
