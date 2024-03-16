package com.github.danilogmoura.estoque;

import java.util.ArrayList;

public class GerenciadorEstoque<T extends Estocavel> {

    ArrayList<T> itens;

    public GerenciadorEstoque() {
        itens = new ArrayList<>();
    }

    public void adicionar(T item) {
        itens.add(item);
    }

    public int getQuantidadeTotal() {
        int quantidadeTotal = 0;

        for (T item : itens) {
            quantidadeTotal += item.getQuantidadeEstoque();
        }

        return quantidadeTotal;
    }
}
