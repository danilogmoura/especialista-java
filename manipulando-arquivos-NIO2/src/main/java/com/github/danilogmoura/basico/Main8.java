package com.github.danilogmoura.basico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

import static com.github.danilogmoura.PathsFiles.DEFAULT;

public class Main8 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of(DEFAULT, "docs\\arquivo.txt");

        System.out.println("Tamanho: " + Files.size(arquivo));
        System.out.println("É arquivo: " + Files.isRegularFile(arquivo));
        System.out.println("É diretório: " + Files.isDirectory(arquivo));

        Instant ultimaAlteracao = Files.getLastModifiedTime(arquivo).toInstant();
        System.out.println("Última alteração: " + ultimaAlteracao);

        System.out.println("É oculto: " + Files.isHidden(arquivo));
        System.out.println("Pode ler: " + Files.isReadable(arquivo));
        System.out.println("Pode escrever: " + Files.isWritable(arquivo));
        System.out.println("Pode executar: " + Files.isExecutable(arquivo));
    }
}
