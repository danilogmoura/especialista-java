package com.github.danilogmoura.loja;

import com.github.danilogmoura.loja.pagamento.MetodoPagamento;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private final List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (ItemCarrinho item : itens) {
            valorTotal += item.getValor();
        }

        return valorTotal;
    }


    public void finalizar(MetodoPagamento metodoPagamento) {
        double valorTotal = calcularValorTotal();
        metodoPagamento.pagar(valorTotal);

        System.out.printf("Pedido finalizado: R$%.2f%n", valorTotal);
    }
}
