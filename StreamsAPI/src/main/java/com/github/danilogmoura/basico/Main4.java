package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.Comparator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .sorted(Comparator.comparingInt(Produto::getQuantidade))
                .forEach(produto -> System.out.printf("%s = %d unidades%n",
                        produto.getNome(), produto.getQuantidade()));
    }
}
