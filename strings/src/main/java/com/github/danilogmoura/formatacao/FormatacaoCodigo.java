package com.github.danilogmoura.formatacao;

public class FormatacaoCodigo {

    public static void main(String[] args) {

        // 0000000123
        long codigo = 123L;

        String codigoFormatado = preencherEsquerda(String.valueOf(codigo), '0', 10);
        System.out.println(codigoFormatado);
    }

    private static String preencherEsquerda(String text, char caracter, int tamanhoTotal) {
        if (text.length() > tamanhoTotal) {
            return text;
        }

        return String.valueOf(caracter).repeat(tamanhoTotal - text.length()).concat(text);
    }
}