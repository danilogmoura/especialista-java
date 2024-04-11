package com.github.danilogmoura.ClassesSeladas.pagamento;

import java.math.BigDecimal;

public sealed abstract class MetodoPagamento permits Pix, CartaoDeCredito {

    private BigDecimal tarifa;

    public MetodoPagamento(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }

    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }
}