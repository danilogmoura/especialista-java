package com.github.danilogmoura.agencia;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        var hotel = new Hotel(nome, cidade, precoDiaria);

        if (this.hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }


    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {
        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();

        for (int i = 0; i < this.hoteis.size(); i++) {
            var hotel = hoteis.get(i);
            if (hotel.getCidade().equals(cidade)) {
                hoteisParaRemocao.add(hotel);
//                hoteis.remove(i);
//                i--;
            }
        }
        this.hoteis.removeAll(hoteisParaRemocao);
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
