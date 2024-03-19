package com.github.danilogmoura;

import java.util.regex.Pattern;

public class Teste {

    public static void main(String[] args) {
        String email = "a-a@algaw9-orks.com";

        boolean valido = Pattern.matches("[\\w.\\w-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);

        System.out.println(valido);
    }
}
