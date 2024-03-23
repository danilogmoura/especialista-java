package com.github.danilogmoura.naoEstatica.exemplo2Shadowing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private final List<Transacao> transacoes = new ArrayList<>();
    private BigDecimal saldo;

    public ContaCorrente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public class Transacao {

        private final String descricao;
        private final BigDecimal valor;
//        private BigDecimal saldo;

        public Transacao(String descricao, BigDecimal valor) {
            this.descricao = descricao;
            this.valor = valor;

//            this.saldo = this.saldo.subtract(valor);
            ContaCorrente.this.saldo = ContaCorrente.this.saldo.subtract(valor);
            transacoes.add(this);
        }

        public String getDescricao() {
            return descricao;
        }

        public BigDecimal getValor() {
            return valor;
        }
    }
}
