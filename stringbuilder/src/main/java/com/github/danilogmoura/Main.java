package com.github.danilogmoura;

public class Main {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

//        String texto = "";

        StringBuilder sb = new StringBuilder(410_000);

        for (int i = 0; i < 400_000; i++) {
//            texto = texto + "#";
            sb.append("#");
        }

//        System.out.println(texto);
        System.out.println(sb);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1_000;
        System.out.printf("Duração: %.2fs%n", duracao);
    }
}
