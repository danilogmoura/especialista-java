package com.github.danilogmoura.ioarquivos;

import java.io.*;

public class Main8 {
    public static void main(String[] args) {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";
        File arquivoOrigem = new File(motherPath, "docs\\img.png");
        File arquivoDestino = new File(motherPath, "docs\\picanha.png");

        try (InputStream inputStream = new FileInputStream(arquivoOrigem);
             OutputStream outputStream = new FileOutputStream(arquivoDestino)) {
            byte[] conteudo = new byte[1024];
            int quantidadeBytes;

            while ((quantidadeBytes = inputStream.read(conteudo)) > 0) {
                outputStream.write(conteudo, 0, quantidadeBytes);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
