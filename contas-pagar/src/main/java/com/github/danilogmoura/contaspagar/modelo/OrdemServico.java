package com.github.danilogmoura.contaspagar.modelo;

import com.github.danilogmoura.contaspagar.pagamento.Beneficiario;
import com.github.danilogmoura.contaspagar.pagamento.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel {

    private Beneficiario fornecedor;
    private double valorTotal;

    public OrdemServico(Beneficiario fornecedor, double valorTotal) {
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValor() {
        return getValorTotal();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFornecedor();
    }
}
