package com.github.danilogmoura.ioarquivos;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        String motherPath = "C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura";


//        File pasta1 = new File(motherPath, "docs\\");
//        System.out.printf("Arquivo 1 criardo: %b%n", pasta1.mkdir());


//        File arquivo1 = new File(pasta1, "contrato.txt");
//        System.out.printf("Arquivo 1 criardo: %b%n", arquivo1.createNewFile());


        File pasta2 = new File(motherPath, "documentos");
//        System.out.println(pasta1.renameTo(pasta2));


        File arquivo1 = new File(pasta2, "contrato.txt");
        System.out.println(arquivo1.delete());
        System.out.println(pasta2.delete());
    }
}
