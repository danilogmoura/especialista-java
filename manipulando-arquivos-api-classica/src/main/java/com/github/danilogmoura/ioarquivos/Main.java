package com.github.danilogmoura.ioarquivos;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File pasta1 = new File("E:\\docs");
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());

        File pasta2 = new File("E:\\fotos\\viagem");
        System.out.printf("Pasta 2 criada: %b%n", pasta2.mkdirs());

        File arquivo1 = new File("E:\\contrato.txt");
        File arquivo2 = new File("E:\\docs\\contrato.txt");
        File arquivo3 = new File("E:\\fotos", "viagem\\contrato.txt");
        File arquivo4 = new File(pasta1, "contrato.txt");

        System.out.printf("Arquivo 3 criada: %b%n", arquivo4.createNewFile());

    }
}
