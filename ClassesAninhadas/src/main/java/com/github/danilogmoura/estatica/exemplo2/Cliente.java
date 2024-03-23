package com.github.danilogmoura.estatica.exemplo2;

import java.util.Comparator;
import java.util.List;

public class Cliente {

    private final String nome;
    private final int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void ordenarPorIdade(List<Cliente> clientes) {
        clientes.sort(new IdedadeComparator());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", idade=" + idade +
               '}';
    }

    private static class IdedadeComparator implements Comparator<Cliente> {

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
    }
}
