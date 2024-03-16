package com.github.danilogmoura;

import com.github.danilogmoura.crm.Cliente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        var clientes = new ArrayList<Cliente>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Supermercado Pague e Leve", 2_000_000));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_000));

        double totalFaturamento = 0d;

        for (Cliente cliente : clientes) {
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }
}
