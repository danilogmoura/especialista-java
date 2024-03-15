package com.github.danilogmoura.loja.pagamento;

public class Transferencia implements MetodoPagamento {

    private final String agencia;
    private final String numeroConta;

    public Transferencia(String agencia, String numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    @Override
    public void pagar(double valor) {
        if (!getNumeroConta().startsWith("999")) {
            throw new RuntimeException("Pagamento negado");
        }

        System.out.printf("Pagamento de R$%.2f realizado. Agência %s, conta %s%n", valor, getAgencia(), getNumeroConta());
    }
}
