package com.github.danilogmoura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main4 {

    public static void main(String[] args) {

        Path arquivo = Path.of("D:\\temp\\teste.txt");

        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
