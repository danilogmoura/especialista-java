package com.github.danilogmoura.ioarquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main10 {
    public static void main(String[] args) {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";
        File arquivoDestino = new File(motherPath, "docs\\lista.txt");

        String[] nomes = {"João", "Maria", "Sebastião", "José"};

        try (Writer excritor = new FileWriter(arquivoDestino)) {
            for (String nome : nomes) {
                excritor.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
