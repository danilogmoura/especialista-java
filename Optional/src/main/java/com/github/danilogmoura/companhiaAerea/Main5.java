package com.github.danilogmoura.companhiaAerea;

public class Main5 {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);

        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28A888", 1);

        Passageiro passageiro = servicoDeReserva.buscar("28A888")
                                        .filter(r -> r.getQunatidadeBagagens() > 0)
                                        .map(Reserva::getPassageiro)
                                        .orElseThrow(RuntimeException::new)
                                        .orElseThrow(RuntimeException::new);

        System.out.println(passageiro);

//        Reserva reserva = servicoDeReserva.buscar("28A888")
//                                  .filter(r -> r.getQunatidadeBagagens() > 0)
//                                  .orElseThrow(RuntimeException::new);
//        var passageiro = reserva.getPassageiro();
//        System.out.println(passageiro);
    }
}
