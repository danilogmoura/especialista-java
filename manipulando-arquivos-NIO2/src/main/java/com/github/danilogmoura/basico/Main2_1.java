package com.github.danilogmoura.basico;

import java.nio.file.Path;

public class Main2_1 {
    public static void main(String[] args) {
        Path pasta = Path.of("docs");
        Path arquivo = Path.of("contrato.txt");

        Path arquivoResolvido = pasta.resolve(arquivo);

        System.out.println(arquivoResolvido.toAbsolutePath());
    }
}
