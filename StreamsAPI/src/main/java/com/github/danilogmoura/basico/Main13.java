package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;

public class Main13 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        int totalEstoque = produtos.stream()
//                                      .mapToInt(Produto::getQuantidade)
//                                      .reduce(0, Integer::sum);
//        System.out.println(totalEstoque);

//        int totalEstoque = produtos.stream()
//                                   .mapToInt(Produto::getQuantidade)
//                                   .sum();
//        System.out.println(totalEstoque);


//        double mediaEstoque = produtos.stream()
//                                      .mapToInt(Produto::getQuantidade)
//                                      .average()
//                                      .orElseThrow(() -> new RuntimeException("Não há produtos para qualcular a média"));
//        System.out.println(mediaEstoque);

        long totalProdutosComEstoque = produtos.stream()
                                               .filter(Produto::temEstoque)
                                               .count();
        System.out.println(totalProdutosComEstoque);
    }
}
