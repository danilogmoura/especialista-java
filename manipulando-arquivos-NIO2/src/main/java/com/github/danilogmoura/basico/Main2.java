package com.github.danilogmoura.basico;

import java.nio.file.Path;

public class Main2 {

    public static void main(String[] args) {
        Path arquivo = Path.of("..\\contrato.txt");

        Path arquivoAbsoluto = arquivo.toAbsolutePath();
        Path arquivoNormalizado = arquivoAbsoluto.normalize();

        System.out.println(arquivoAbsoluto.isAbsolute());
        System.out.println(arquivo.isAbsolute());

        System.out.println(arquivo);
        System.out.println(arquivoAbsoluto);
        System.out.println(arquivoNormalizado);
    }
}
