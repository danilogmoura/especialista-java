package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.math.BigDecimal;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        var valorEmEstoque = produtos.stream()
//                                     .map(produto -> produto.getPreco().multiply(new BigDecimal(produto.getQuantidade())))
//                                     .reduce(BigDecimal.ZERO, BigDecimal::add);
//        System.out.println(valorEmEstoque); 3100

//        var valorEmEstoque = produtos.stream()
//                                     .map(Produto::getValoEstoque)
//                                     .reduce(BigDecimal.ZERO, BigDecimal::add);
//        System.out.println(valorEmEstoque);

//        var valorEmEstoque = produtos.stream()
//                                     .map(produto -> produto.getPreco().multiply(new BigDecimal(produto.getQuantidade())))
//                                     .reduce(BigDecimal.ZERO, BigDecimal::add);
//        System.out.println(valorEmEstoque);

        var valorEmEstoque = produtos.stream()
                                     .reduce(BigDecimal.ZERO, (subtotal, produto) -> {
                                         BigDecimal valorEstoqueProduto = produto.getPreco().multiply(new BigDecimal(produto.getQuantidade()));
                                         return subtotal.add(valorEstoqueProduto);
                                     }, BigDecimal::add);
        System.out.println(valorEmEstoque);
    }
}
