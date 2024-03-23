package com.github.danilogmoura.estatica.exemplo3;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 41);
        System.out.println(cliente);

        cliente.setStatus(Cliente.Status.BLOQUEADO);
        System.out.println(cliente);
    }
}
