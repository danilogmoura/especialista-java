package com.github.danilogmoura.basico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.github.danilogmoura.PathsFiles.DEFAULT;

public class Main9 {
    public static void main(String[] args) throws IOException {
        Path pasta = Path.of(DEFAULT, "docs");

//        Files.list(pasta).forEach(System.out::println);

        try (var stream = Files.list(pasta)) {
            stream.filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(name -> name.matches(".*\\.txt"))
                    .forEach(System.out::println);
        }
    }
}
