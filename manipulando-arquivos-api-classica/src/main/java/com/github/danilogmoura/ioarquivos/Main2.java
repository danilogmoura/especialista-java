package com.github.danilogmoura.ioarquivos;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File arquivo1 = new File("E:\\docs\\contrato.txt");
        System.out.println(arquivo1);

        File arquivo2 = new File("docs\\contrato.txt");
        System.out.println(arquivo2);
        System.out.println(arquivo2.getAbsoluteFile());

        var arquivo3 = new File("..\\docs\\contrato.txt");
        System.out.println(arquivo3.getAbsoluteFile());
        System.out.println(arquivo3.getCanonicalFile());
    }
}
