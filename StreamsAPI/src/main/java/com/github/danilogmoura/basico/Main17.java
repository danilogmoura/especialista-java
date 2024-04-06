package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Categoria;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;

public class Main17 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
                                             .filter(Produto::temEstoque)
                                             .flatMap(produto -> produto.getCategorias().stream())
                                             .distinct()
                                             .toList();
//                                             .collect(toUnmodifiableList());
        categorias.remove(0);
        System.out.println(categorias);
    }
}
