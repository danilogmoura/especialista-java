package com.github.danilogmoura.desafio;

import com.github.danilogmoura.desafio.io.UnificadorDeArquivos;

import java.io.IOException;
import java.nio.file.Path;

import static com.github.danilogmoura.desafio.io.PathFiles.FOTOS_DESFRAGMENTADAS;
import static com.github.danilogmoura.desafio.io.PathFiles.FOTOS_FRAGMENTADAS;

public class Main2 {
    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivos(
                    Path.of(FOTOS_FRAGMENTADAS),
                    Path.of(FOTOS_DESFRAGMENTADAS, "\\picanha-unificado.png"),
                    "picanha.png");

            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }
}
