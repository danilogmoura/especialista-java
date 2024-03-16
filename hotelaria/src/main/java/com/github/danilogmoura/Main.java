package com.github.danilogmoura;

import com.github.danilogmoura.agencia.CadastroHotel;
import com.github.danilogmoura.agencia.Hotel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);
        cadastro.adicionar("Vila Selvagem", "Fortaleza/CE", 1400);


        cadastro.removerPorCidade("Fortim/CE");
        ArrayList<Hotel> hoteis = cadastro.obterTodos();

        //        var indice = hoteis.indexOf(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 0));
        //        System.out.println(indice);
        //        System.out.println(hoteis.get(indice));

        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            var hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
