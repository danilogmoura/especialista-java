package com.github.danilogmoura.basico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.github.danilogmoura.PathsFiles.DEFAULT;

public class Main10 {
    public static void main(String[] args) throws IOException {
        Path pasta = Path.of(DEFAULT, "docs");

        try (var stream = Files.find(pasta, Integer.MAX_VALUE, (path, attrs) -> path.getFileName().toString().matches(".*\\.txt"))) {
            stream
//                    .map(Path::getFileName)
                    .forEach(System.out::println);
        }
    }
}
