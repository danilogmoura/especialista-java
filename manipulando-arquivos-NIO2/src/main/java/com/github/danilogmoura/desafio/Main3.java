package com.github.danilogmoura.desafio;

import com.github.danilogmoura.desafio.io.EscritorArquivoMaiusculo;

import java.io.IOException;
import java.nio.file.Path;

import static com.github.danilogmoura.desafio.io.PathFiles.TEXTOS;

public class Main3 {
    public static void main(String[] args) {
        try {
            var escritor = new EscritorArquivoMaiusculo(
                    Path.of(TEXTOS, "poema1.txt"),
                    Path.of(TEXTOS, "poema2.txt"));

            escritor.processar();
        } catch (IOException e) {
            System.out.println("Erro processando e escrevendo novo arquivo");
            e.printStackTrace();
        }
    }
}
