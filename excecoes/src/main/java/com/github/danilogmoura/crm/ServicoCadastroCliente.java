package com.github.danilogmoura.crm;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) {
        if (idade < 18) {
            throw new MenorDeIdadeException("Cliente menor de idade não pode ser cadastrado");
        }

        // faz o cadastro aqui

        return new Cliente(nome, idade);
    }
}
