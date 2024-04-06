package com.github.danilogmoura.ioarquivos;

import java.io.*;

public class Main6 {
    public static void main(String[] args) {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";
        File arquivoOrigem = new File(motherPath, "docs\\contrato.txt");


        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(arquivoOrigem);

            int conteudo;
            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Não foi possível fechar fluxo com arquivo");
                }
            }
        }
    }
}
