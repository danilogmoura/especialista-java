package com.github.danilogmoura.estatica.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("João", 41));
        clientes.add(new Cliente("Maria", 37));
        clientes.add(new Cliente("Sebastião", 27));

        System.out.println(clientes);

        Cliente.ordenarPorIdade(clientes);

        System.out.println(clientes);
    }
}
