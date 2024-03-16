package com.github.danilogmoura.loja;

public class Produto {

    private final String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                       "descricao='" + descricao + '\'' +
                       '}';
    }
}
