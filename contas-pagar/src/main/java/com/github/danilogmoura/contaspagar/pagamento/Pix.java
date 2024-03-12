package com.github.danilogmoura.contaspagar.pagamento;

public class Pix implements MetodoPagamento {


    @Override
    public void pagar(DocumentoPagavel documentoPagavel) {
        var beneficiario = documentoPagavel.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave Pix");
        }

        System.out.printf("DEBUG: Efeturando PIX para %s no valor de %.2f com a chave %s%n",
                beneficiario.getNome(), documentoPagavel.getValor(), beneficiario.getChavePix());
    }
}
