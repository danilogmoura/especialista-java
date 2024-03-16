package com.github.danilogmoura.estoque;

public class Roupa implements Estocavel {

    private final String descricao;
    private final int quantidadeEstoque;

    public Roupa(String descricao, int quantidadeEstoque) {
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                       "descricao='" + descricao + '\'' +
                       ", quantidadeEstoque=" + quantidadeEstoque +
                       '}';
    }
}
