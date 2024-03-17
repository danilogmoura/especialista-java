package com.github.danilogmoura.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CadastroHotel {

    private final List<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        var hotel = new Hotel(nome, cidade, precoDiaria);

        if (this.hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }


    public List<Hotel> obterTodos() {
        return hoteis;
    }

    public Hotel[] obterTodosComoArray() {
        return hoteis.toArray(new Hotel[0]);
    }

    public void ordernar() {
        Collections.sort(hoteis);
    }

    public void orderPorPreco() {
        hoteis.sort(new PrecoHotelComparator()
                            .reversed()
                            .thenComparing(Comparator.naturalOrder()));
    }

    public void removerPorCidade(String cidade) {
        var hotelIterator = hoteis.iterator();

        while (hotelIterator.hasNext()) {
            var hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }
        }
    }


    public void remover(Hotel hotel) {
        var removido = this.hoteis.remove(hotel);

        if (!removido) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção");
        }
    }

    public void removerTodos() {
        this.hoteis.clear();
    }
}
