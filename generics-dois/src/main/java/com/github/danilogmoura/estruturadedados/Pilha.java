package com.github.danilogmoura.estruturadedados;

import java.util.Arrays;
import java.util.Objects;

public class Pilha<T> {

    private T[] itens;

    public Pilha() {
        this.itens = (T[]) new Objects[0];
    }

    public void colocar(T item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public T retirar() {
        if (itens.length == 0) {
            throw new PilhaVaziaException("Pilha sem itens");
        }

        T item = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);

        return item;
    }
}
