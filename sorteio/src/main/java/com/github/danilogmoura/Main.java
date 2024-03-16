package com.github.danilogmoura;

import com.github.danilogmoura.sorteio.Cliente;
import com.github.danilogmoura.sorteio.Sorteador;

public class Main {

    public static void main(String[] args) {
        String[] nomes = {"João", "José", "Maria"};
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);


        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve", 2_000_000),
                new Cliente("Posto Gasolina Boa", 800_000),
                new Cliente("Javac Consultoria", 58_000_000)
        };

        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
