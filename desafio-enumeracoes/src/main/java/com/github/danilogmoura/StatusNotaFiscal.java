package com.github.danilogmoura;

public enum StatusNotaFiscal {

    NAO_EMITIDA("Não emitida") {
        @Override
        public boolean podeCancelar(double valorTotal) {
            return true;
        }

        @Override
        public boolean podeEmitir() {
            return true;
        }
    },
    EMITIDA("Emitida") {
        @Override
        public boolean podeCancelar(double valor) {
            return valor < 1_000;
        }

        @Override
        public boolean podeEmitir() {
            return false;
        }
    },
    CANCELADA("Cancelada") {
        @Override
        public boolean podeCancelar(double valorTotal) {
            return false;
        }

        @Override
        public boolean podeEmitir() {
            return false;
        }
    };

    private final String decricacao;

    StatusNotaFiscal(String decricacao) {
        this.decricacao = decricacao;
    }

    public String getDecricao() {
        return decricacao;
    }

    public abstract boolean podeCancelar(double valorTotal);

    public abstract boolean podeEmitir();
}
