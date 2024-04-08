package com.github.danilogmoura.basico;

import com.github.danilogmoura.PathsFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main3 {
    public static void main(String[] args) throws IOException {
//        Path pastaDocs = Path.of(PathsFiles.DEFAULT, "docs");
//        Files.createDirectory(pastaDocs);

        Path pastaFornecedores = Path.of(PathsFiles.DEFAULT, "\\docs\\contratos\\fornecedores");
//        Files.createDirectories(pastaFornecedores);

        Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato002.txt"));
        Files.createFile(arquivoContrato);
        System.out.println(Files.exists(arquivoContrato));
    }
}
