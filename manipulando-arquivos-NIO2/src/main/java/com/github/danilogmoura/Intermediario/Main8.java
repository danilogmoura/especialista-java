package com.github.danilogmoura.Intermediario;

import com.github.danilogmoura.PathsFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main8 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of(PathsFiles.DEFAULT, "docs\\arquivo.txt");

//        Files.writeString(path, "Opa");

//        var linhas = Arrays.asList("Opa!", "Beleza, mergulhador?");
//        Files.write(path, linhas);

        byte[] bytes = {79, 108, -61, -95};
        Files.write(path, bytes);
    }
}
