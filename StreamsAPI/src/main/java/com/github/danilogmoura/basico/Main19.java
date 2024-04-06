package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Fabricante;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main19 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<Fabricante, List<Produto>> produtosPorFabricate =
                produtos.stream()
                        .filter(Produto::temEstoque)
                        .collect(Collectors.groupingBy(Produto::getFabricante));

        produtosPorFabricate.forEach((fabricante, produtosDoFabricante) -> {
            System.out.println();
            System.out.println(fabricante.nome());
            System.out.println("--------");
            produtosDoFabricante.forEach(produto -> System.out.println(produto.getNome()));
        });
    }
}
