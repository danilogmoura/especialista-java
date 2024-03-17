package com.github.danilogmoura;

import com.github.danilogmoura.agencia.CadastroHotel;
import com.github.danilogmoura.agencia.Hotel;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);
        cadastro.adicionar("Vila Selvagem Avenida", "Fortaleza/CE", 1400);

        cadastro.orderPorPreco();

        List<Hotel> hoteis = cadastro.obterTodos();

        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(List<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
