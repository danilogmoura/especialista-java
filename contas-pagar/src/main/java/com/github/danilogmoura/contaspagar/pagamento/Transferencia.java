package com.github.danilogmoura.contaspagar.pagamento;

public class Transferencia implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {
        var beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui conta bancária");
        }

        System.out.printf("DEBUG: Efeturando tranferência para %s no valor de %.2f para a conta bancária %s%n",
                beneficiario.getNome(), documento.getValor(), beneficiario.getContaBancaria());
    }
}

