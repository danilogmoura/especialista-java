package com.github.danilogmoura.desafio;

import com.github.danilogmoura.desafio.io.FragmentadorDeArquivos;
import com.github.danilogmoura.desafio.io.PathFiles;

import java.io.File;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivos(
                    new File(PathFiles.PARENT_PATH_FOTOS, "picanha.png"),
                    1024 * 50);

            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro ao fragmentador arquivo");
            e.printStackTrace();
        }
    }
}
