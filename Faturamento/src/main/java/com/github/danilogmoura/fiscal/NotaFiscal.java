package com.github.danilogmoura.fiscal;

public abstract class NotaFiscal {

    private final String descricao;
    private final double valorTotal;

    protected NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos();

    public void emitir() {
        System.out.printf("Emitindo nota fiscal para: %s%n", getDescricao());
        System.out.printf("Valor total: %.2f%n", getValorTotal());
        System.out.printf("Impotos: %.2f%n", calcularImpostos());
    }
}
