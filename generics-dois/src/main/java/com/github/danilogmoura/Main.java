package com.github.danilogmoura;

import com.github.danilogmoura.estruturadedados.Pilha;
import com.github.danilogmoura.loja.Produto;

public class Main {

    public static void main(String[] args) {
        var pilha = new Pilha<Produto>();
//        pilha.colocar("A");
//        pilha.colocar("B");
        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Feijão"));

        Produto produto = pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = pilha.retirar();
        System.out.println(produto.getDescricao());

//        produto = pilha.retirar();
//        System.out.println(produto.getDescricao());
    }
}
