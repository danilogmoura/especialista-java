package com.github.danilogmoura.desafio;

import com.github.danilogmoura.desafio.io.FragmentadorDeArquivos;
import com.github.danilogmoura.desafio.io.PathFiles;

import java.io.IOException;
import java.nio.file.Path;

public class Main1 {

    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivos(
                    Path.of(PathFiles.FOTOS, "picanha.png"),
                    1024 * 50);

            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro ao fragmentador arquivo");
            e.printStackTrace();
        }
    }
}
