package com.github.danilogmoura.ioarquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main11 {
    public static void main(String[] args) {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";
        File arquivoDestino = new File(motherPath, "docs\\lista.txt");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoDestino))) {
            String linha = null;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

    }
}
