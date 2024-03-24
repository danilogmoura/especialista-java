package com.github.danilogmoura.companhiaAerea;

public class Main2 {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

//        var reserva = servicoDeReserva.buscar("28A888X")
//                              .orElse(null);

//        var reserva = servicoDeReserva.buscar("28A888X")
//                              .orElse(new Reserva("00000", voo, "Não informado"));


//        var reserva = servicoDeReserva.buscar("28A888X")
//                              .orElseGet(() -> new Reserva("00000", voo, "Não informado"));

        var reserva = servicoDeReserva.buscar("28A888X", () -> new Reserva("00000", voo, "Não informado"));

        System.out.println(reserva);

    }
}
