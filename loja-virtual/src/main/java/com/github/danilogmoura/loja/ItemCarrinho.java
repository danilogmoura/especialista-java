package com.github.danilogmoura.loja;

public class ItemCarrinho {

    private final String descricao;
    private final double valor;

    public ItemCarrinho(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
