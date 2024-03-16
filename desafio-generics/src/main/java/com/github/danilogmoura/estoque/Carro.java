package com.github.danilogmoura.estoque;

public class Carro implements Estocavel {

    private final String modelo;
    private final int quantidadeEstoque;

    public Carro(String modelo, int quantidadeEstoque) {
        this.modelo = modelo;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Carro{" +
                       "modelo='" + modelo + '\'' +
                       ", quantidadeEstoque=" + quantidadeEstoque +
                       '}';
    }
}
