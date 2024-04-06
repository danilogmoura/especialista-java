package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        boolean temProdutoNoEsoque = produtos.stream()
//                                             .peek(System.out::println)
//                                             .anyMatch(Produto::temEstoque);
//        System.out.println(temProdutoNoEsoque);

//        boolean todosProdutosPossuemEstoque = produtos.stream()
//                                                      .peek(System.out::println)
//                                                      .allMatch(Produto::temEstoque);
//        System.out.println(todosProdutosPossuemEstoque);

        boolean nenhumProdutosPossuemEstoque = produtos.stream()
                                                       .peek(System.out::println)
                                                       .noneMatch(Produto::temEstoque);
        System.out.println(nenhumProdutosPossuemEstoque);
    }
}
