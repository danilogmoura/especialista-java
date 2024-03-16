package com.github.danilogmoura.crm;

public class Pesquisador {

//    public static <T extends Nomeavel & PessoaJuridica> T obterPorNome(T[] itens, String nome) {

    public static <T extends Nomeavel> T obterPorNome(T[] itens, String nome) {
        for (T item : itens) {
            if (item.getNome().equals(nome)) {
                return item;
            }
        }

        throw new RuntimeException("Funcionário não encontrado pelo nome");
    }
}
