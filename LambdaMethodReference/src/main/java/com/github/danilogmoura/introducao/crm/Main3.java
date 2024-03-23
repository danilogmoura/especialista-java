package com.github.danilogmoura.introducao.crm;

import java.util.List;

public class Main3 {

    private String nome;

    public static void main(String[] args) {
        new Main3().executar();
    }

    public void executar() {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %s%n", cliente.getNome(), cliente.getIdade());
        }
    }
}
