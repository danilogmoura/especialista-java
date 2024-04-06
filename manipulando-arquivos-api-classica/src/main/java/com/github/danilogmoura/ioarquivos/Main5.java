package com.github.danilogmoura.ioarquivos;

import java.io.File;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) throws IOException {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";
        File pasta = new File(motherPath, "docs\\");

//        var arquivos = pasta.listFiles();
//        var arquivos = pasta.listFiles(File::isFile);
//        var arquivos = pasta.listFiles(File::isDirectory);
        var arquivos = pasta.listFiles((dir, nome) -> nome.startsWith("c"));

        if(arquivos != null) {
            for (File arquivo : arquivos) {
                System.out.println(arquivo.getName());
            }
        }
    }
}
