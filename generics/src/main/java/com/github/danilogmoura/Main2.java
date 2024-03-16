package com.github.danilogmoura;

import com.github.danilogmoura.crm.Cliente;
import com.github.danilogmoura.crm.Funcionario;
import com.github.danilogmoura.crm.Pesquisador;

public class Main2 {

    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Funcionario("João", 40),
                new Funcionario("José", 20),
                new Funcionario("Maria", 30)
        };

        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve", 2_000_000),
                new Cliente("Posto Gasolina Boa", 800_000),
                new Cliente("Javac Consultoria", 58_000_000)
        };

        var funcionarioEncontrado = Pesquisador.obterPorNome(funcionarios, "José");
        System.out.println(funcionarioEncontrado);

        var clienteEncontrado = Pesquisador.obterPorNome(clientes, "Posto Gasolina Boa");
        System.out.println(clienteEncontrado);
    }
}
