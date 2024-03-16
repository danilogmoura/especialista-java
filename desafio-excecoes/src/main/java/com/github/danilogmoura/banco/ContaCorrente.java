package com.github.danilogmoura.banco;

import com.github.danilogmoura.exceptions.ContaInativaException;
import com.github.danilogmoura.exceptions.SaldoInsuficienteException;

import java.util.Objects;

public class ContaCorrente {

    private final String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta inativa");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino);

        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta inativa, não é possível sacar");
        }

        sacar(valor);
        contaDestino.depositar(valor);
    }

    private void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Conta sem saldo");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta inativa");
        }

        this.saldo -= valor;
    }
}
