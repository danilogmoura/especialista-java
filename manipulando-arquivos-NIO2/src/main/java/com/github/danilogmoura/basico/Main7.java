package com.github.danilogmoura.basico;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static com.github.danilogmoura.PathsFiles.DEFAULT;

public class Main7 {
    public static void main(String[] args) throws IOException {
//        Path arquivoContrato = Path.of(DEFAULT, "docs\\contratos\\fornecedores\\contrato002.txt");

        Path pastaDocs = Path.of(DEFAULT, "docs");
//        Files.delete(pastaDocs);

        Files.walkFileTree(pastaDocs, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.printf("Excluindo arquivo: %s%n", file);
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.printf("Excluindo diretório: %s%n", dir);
                Files.delete(dir);
                return super.postVisitDirectory(dir, exc);
            }
        });

    }
}
