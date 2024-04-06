package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.Comparator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        boolean temProdutoComEstoque = produtos.stream()
                                               .peek(System.out::println)
                                               .filter(Produto::temEstoque)
                                               .sorted(Comparator.comparingInt(Produto::getQuantidade))
                                               .anyMatch(Produto::temEstoque);

        System.out.println(temProdutoComEstoque);
    }
}
