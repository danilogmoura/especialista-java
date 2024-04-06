package com.github.danilogmoura.ioarquivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main9 {
    public static void main(String[] args) {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";
        File arquivoOrigem = new File(motherPath, "docs\\contrato.txt");
        StringBuilder texto = new StringBuilder();

        try (Reader leitor = new FileReader(arquivoOrigem)) {
            char[] conteudo = new char[1_000];
            int quantidadeCaracteres;

            while ((quantidadeCaracteres = leitor.read(conteudo)) > 0) {
                texto.append(conteudo, 0, quantidadeCaracteres);
            }

            System.out.println(texto);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

    }
}
