package com.github.danilogmoura.ioarquivos;

import java.io.*;

public class Main12 {
    public static void main(String[] args) {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";
        File arquivoOrigem = new File(motherPath, "docs\\lista.txt");
        File arquivoDestino = new File(motherPath, "docs\\saida.txt");

        try (Reader leitor = new FileReader(arquivoOrigem);
             Writer escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {
            int conteudo;

            while ((conteudo = leitor.read()) != -1) {
                escritor.write(conteudo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

    }
}
