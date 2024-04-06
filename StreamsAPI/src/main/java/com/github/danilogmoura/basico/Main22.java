package com.github.danilogmoura.basico;

import com.github.danilogmoura.basico.estoque.CadastroProduto;
import com.github.danilogmoura.basico.estoque.Fabricante;
import com.github.danilogmoura.basico.estoque.Produto;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class Main22 {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        List<Fabricante> fabricantes = new ArrayList<>();
//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .forEach(produto -> {
//                    if (!fabricantes.contains(produto.getFabricante())) {
//                        fabricantes.add(produto.getFabricante());
//                    }
//                });
//        System.out.println(fabricantes);

        List<Fabricante> fabricantes = produtos.stream()
                                               .filter(Produto::temEstoque)
                                               .map(Produto::getFabricante)
                                               .distinct()
                                               .collect(toCollection(ArrayList::new));
        System.out.println(fabricantes);
    }
}
