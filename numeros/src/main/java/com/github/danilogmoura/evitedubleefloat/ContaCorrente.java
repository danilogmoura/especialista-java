package com.github.danilogmoura.evitedubleefloat;

import java.math.BigDecimal;

public class ContaCorrente {

    private BigDecimal saldo = BigDecimal.ZERO;

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valorSaldo) {
        if (valorSaldo.compareTo(this.saldo) > 0) {
            throw new RuntimeException(
                    String.format("Saque: %s, Saldo: %s", valorSaldo, saldo)
            );
        }

        saldo = saldo.subtract(valorSaldo);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
