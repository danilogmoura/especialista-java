package com.github.danilogmoura.basico;

import com.github.danilogmoura.PathsFiles;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main1 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
//        Path arquivo1 = fs.getPath(PathsFiles.DEFAULT + "\\docs\\contrato.txt");
//        Path arquivo1 = fs.getPath(PathsFiles.DEFAULT, "docs", "contrato.txt");
        Path arquivo1 = Path.of(PathsFiles.DEFAULT, "docs", "contrato.txt");

        var nomeArquivo = arquivo1.getFileName();
        var pasta = arquivo1.getParent();

        System.out.println(nomeArquivo);
        System.out.println(pasta);

        File arquivo2 = arquivo1.toFile();
        Path arquivo3 = arquivo2.toPath();
    }
}