package com.github.danilogmoura.desafio.io;

import java.io.*;
import java.util.Objects;

public class EscritorArquivoMaiusculo {

    private final File destino;
    private final File origem;

    public EscritorArquivoMaiusculo(File origem, File destino) {
        Objects.requireNonNull(origem);
        Objects.requireNonNull(destino);
        this.origem = origem;
        this.destino = destino;
    }

    public void processar() throws IOException {
        if (!origem.exists()) {
            throw new IOException("Arquivo não existe");
        }

        try (var reader = new BufferedReader(new FileReader(origem));
             var writer = new BufferedWriter(new FileWriter(destino))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha.toUpperCase());
                writer.newLine();
            }
        }

    }
}
