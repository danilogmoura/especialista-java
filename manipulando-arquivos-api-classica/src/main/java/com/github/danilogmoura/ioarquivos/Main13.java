package com.github.danilogmoura.ioarquivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) throws IOException {

//        InputStream inputStream = System.in;
//        Scanner scanner = new Scanner(inputStream);
//
//        String linha;
//        while (!(linha = scanner.nextLine()).equals("sair")) {
//            System.out.println("Você digitou: " + linha);
//        }

//        InputStream inputStream = System.in;
//        BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream));
//
//        String linha;
//        while (!(linha = leitor.readLine()).equals("sair")) {
//            System.out.println("Você digitou: " + linha);
//        }

        Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\demo\\.github\\Especialista-Java\\manipulando-arquivos-api-classica\\src\\main\\java\\com\\github\\danilogmoura\\docs\\lista.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
