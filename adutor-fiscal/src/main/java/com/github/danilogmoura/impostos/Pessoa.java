package com.github.danilogmoura.impostos;

import java.util.Objects;

public abstract class Pessoa {

    private final String nome;

    protected Pessoa(String nome) {
        Objects.requireNonNull(nome, "Nome não deve ser vazaio");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularImpostos();
}
