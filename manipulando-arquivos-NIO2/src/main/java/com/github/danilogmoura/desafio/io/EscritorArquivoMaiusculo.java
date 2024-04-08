package com.github.danilogmoura.desafio.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import static java.nio.file.StandardOpenOption.*;

public class EscritorArquivoMaiusculo {

    private final Path origem;
    private final Path destino;

    public EscritorArquivoMaiusculo(Path origem, Path destino) {
        Objects.requireNonNull(origem);
        Objects.requireNonNull(destino);
        this.origem = origem;
        this.destino = destino;
    }

    public void processar() throws IOException {
        if (!Files.exists(origem)) {
            throw new IOException("Arquivo não existe");
        }

        try (var reader = Files.newBufferedReader(origem);
             var writer = Files.newBufferedWriter(destino, WRITE, CREATE, TRUNCATE_EXISTING)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha.toUpperCase());
                writer.newLine();
            }
        }
    }
}
