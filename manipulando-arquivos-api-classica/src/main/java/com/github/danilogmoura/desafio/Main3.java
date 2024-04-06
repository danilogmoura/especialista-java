package com.github.danilogmoura.desafio;

import com.github.danilogmoura.desafio.io.EscritorArquivoMaiusculo;
import com.github.danilogmoura.desafio.io.PathFiles;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try {
            var escritor = new EscritorArquivoMaiusculo(
                    new File(PathFiles.PARENT_PATH_TEXTOS, "poema1.txt"),
                    new File(PathFiles.PARENT_PATH_TEXTOS, "poema2.txt"));

            escritor.processar();
        } catch (IOException e) {
            System.out.println("Erro processando e escrevendo novo arquivo");
            e.printStackTrace();
        }
    }
}
