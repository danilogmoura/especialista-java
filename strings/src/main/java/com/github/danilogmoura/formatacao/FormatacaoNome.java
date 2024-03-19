package com.github.danilogmoura.formatacao;

public class FormatacaoNome {

    public static void main(String[] args) {
        String nome = "    Pedro da Silma da Costa de Oliveira    ";

        System.out.println(formatarNome(nome, "da", "de", "do"));
    }

    private static String formatarNome(String nome, String... preposicoesParaexclusao) {
        String nomeFormatado = nome.toUpperCase().strip();


        for (String preposicao : preposicoesParaexclusao) {
            nomeFormatado = nomeFormatado.replace(" " + preposicao.toUpperCase() + " ", " ");
        }

        return nomeFormatado;
    }
}
