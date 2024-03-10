package com.github.danilogmoura.fiscal;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notaFiscais) {
        System.out.println("\n-------------------------------------");
        for (NotaFiscal notaFiscal : notaFiscais) {
            notaFiscal.emitir();
            System.out.println("-------------------------------------");
        }
    }
}
