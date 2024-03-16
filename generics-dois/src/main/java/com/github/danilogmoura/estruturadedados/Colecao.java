package com.github.danilogmoura.estruturadedados;

public interface Colecao<T> {

    void colocar(T item);

    T retirar();
}
