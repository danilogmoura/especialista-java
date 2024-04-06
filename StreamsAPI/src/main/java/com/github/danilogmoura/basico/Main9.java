package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;

public class Main9 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        IntStream stream = produtos.stream()
//                                   .filter(Produto::temEstoque)
//                                   .mapToInt(Produto::getQuantidade);
//        stream.forEach(num -> System.out.println(num * 2));

        produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade)
                .sorted()
                .forEach(num -> System.out.println(num * 2));
    }
}
