package com.github.danilogmoura.companhiaAerea;

import java.util.Objects;

public class ServicoDeBagagem {

    private final ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva) {
        Objects.requireNonNull(servicoDeReserva);
        this.servicoDeReserva = servicoDeReserva;
    }

    public void contratar(String codigoDaReserva, int quantidadeBagagens) {
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida");
        }

        // aqui poderia ter outras regras de negócio

//        servicoDeReserva.buscar(codigoDaReserva)
//                .orElseThrow(ReservaNaoEncontradaException::new)
//                .adicionarBagagens(quantidadeBagagens);

        servicoDeReserva.buscar(codigoDaReserva)
                .orElseThrow(() -> new ReservaNaoEncontradaException("Reserva não encontrada"))
                .adicionarBagagens(quantidadeBagagens);
    }
}
