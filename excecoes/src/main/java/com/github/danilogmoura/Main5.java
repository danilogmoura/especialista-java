package com.github.danilogmoura;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main5 {

    public static void main(String[] args) {
        Path arquivo = Path.of("D:\\temp\\teste.txt");
        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao criar ler arquivo: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("Erro fechamento leitor de arquivo");
            }
        }
    }

}
