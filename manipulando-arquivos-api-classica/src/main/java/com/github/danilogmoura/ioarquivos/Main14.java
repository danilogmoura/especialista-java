package com.github.danilogmoura.ioarquivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main14 {
    public static void main(String[] args) throws IOException {

        var nome = "Danilo";
//        OutputStream out = System.out;
//        out.write("Danilo".getBytes());

//        PrintStream out = System.out;
//        out.printf("Olá, %s%n", nome);

        PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura\\docs\\arquivo.txt"));
        out.printf("Olá, %s%n", nome);
    }
}
