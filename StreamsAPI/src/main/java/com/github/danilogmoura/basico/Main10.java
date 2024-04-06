package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;

public class Main10 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        IntBinaryOperator operacaoSoma = (subtotal, valor) -> {
//            System.out.println(subtotal + " + " + valor);
//            return subtotal + valor;
//        };

//        int totalEstoque = produtos.stream()
//                                   .mapToInt(Produto::getQuantidade)
//                                   .reduce(0, operacaoSoma);
//        System.out.println(totalEstoque);

//        var totalEstoque = produtos.stream()
//                             .mapToInt(Produto::getQuantidade)
//                             .reduce(0, (x, y) -> x + y);
//        System.out.println(totalEstoque);

//        var totalEstoque = produtos.stream()
//                                   .mapToInt(Produto::getQuantidade)
//                                   .reduce(0, Integer::sum);
//        System.out.println(totalEstoque);

        var maximoExtoque = produtos.stream()
                                   .mapToInt(Produto::getQuantidade)
                                   .reduce(0, Integer::max);
        System.out.println(maximoExtoque);
    }
}
