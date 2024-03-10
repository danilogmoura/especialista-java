package com.github.danilogmoura.fiscal;

public class NotaFiscalServico extends NotaFiscal {

    private static final int VALOR_MAXIMO_ISENCAO_FISCAL = 1_000;
    private static final double ALIQUOTA_IMPOSTOS = 0.18;

    private boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }


    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;

        if (isIsentoImpostos()) {
            valorImpostos = 0;
        }

        return valorImpostos;
    }

    private boolean isIsentoImpostos() {
        return intermunicipal && getValorTotal() <= VALOR_MAXIMO_ISENCAO_FISCAL;
    }
}


