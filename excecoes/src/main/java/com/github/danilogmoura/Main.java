package com.github.danilogmoura;

import com.github.danilogmoura.crm.ServicoCadastroCliente;

public class Main {

    public static void main(String[] args) {

        var clienteCadastro = new ServicoCadastroCliente();
        var cliente = clienteCadastro.cadastrar("José da Silva", 17);

        System.out.printf("Cliente cadastrado: %s%n", cliente.getNome());
    }
}
