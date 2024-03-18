package com.github.danilogmoura.comercial;

public class Cliente {

    private String nome;
    private final double limiteCompras;

    public Cliente(String nome, double limiteCompras) {
        this.nome = nome;
        this.limiteCompras = limiteCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimiteCompras() {
        return limiteCompras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                       "nome='" + nome + '\'' +
                       ", limiteCompras=" + limiteCompras +
                       '}';
    }
}
