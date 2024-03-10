package com.github.danilogmoura;

import com.github.danilogmoura.fiscal.GestorFiscal;
import com.github.danilogmoura.fiscal.NotaFiscalProduto;
import com.github.danilogmoura.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

        var nfBolaDeFutebol = new NotaFiscalProduto("Bola de futebol", 300, 50);
        var nfRepadoDaRoda = new NotaFiscalServico("Repado da roda", 1100, true);

        gestorFiscal.emitirNotasFiscais(nfBolaDeFutebol, nfRepadoDaRoda);
    }
}
