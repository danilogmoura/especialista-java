package com.github.danilogmoura;

import com.github.danilogmoura.estruturadedados.Colecao;
import com.github.danilogmoura.estruturadedados.ColecaoVaziaException;
import com.github.danilogmoura.estruturadedados.Fila;
import com.github.danilogmoura.estruturadedados.Pilha;
import com.github.danilogmoura.loja.Produto;

public class Main2 {

    public static void main(String[] args) {
        Colecao<Produto> produtos = new Fila<>();
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("Feijão"));
        produtos.colocar(new Produto("Água de coco"));

        retirarTodos(produtos);


        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("João");
        nomes.colocar("Maria");

        retirarTodos(nomes);
    }

    private static void retirarTodos(Colecao<?> objetos) {
        try {
            int i = 1;
            while (true) {
                var objeto = objetos.retirar();
                System.out.printf("%d. %s%n", i, objeto);
                i++;
            }
        } catch (ColecaoVaziaException e) {
            System.out.println("Coleção de produtos esgotada");
        }
    }
}
