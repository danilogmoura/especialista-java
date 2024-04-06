package com.github.danilogmoura.desafio;

import com.github.danilogmoura.desafio.io.PathFiles;
import com.github.danilogmoura.desafio.io.UnificadorDeArquivos;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivos(
                    new File(PathFiles.PARENT_PATH_FOTOS_FRAGMENTADAS),
                    new File(PathFiles.PARENT_PATH_FOTOS_DESFRAGMENTADAS, "\\picanha-unificado.png"),
                    "picanha.png");

            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }
}
