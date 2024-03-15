package com.github.danilogmoura;

import com.github.danilogmoura.loja.Carrinho;
import com.github.danilogmoura.loja.ItemCarrinho;
import com.github.danilogmoura.loja.pagamento.CartaoCredito;
import com.github.danilogmoura.loja.pagamento.MetodoPagamento;
import com.github.danilogmoura.loja.pagamento.Transferencia;

public class Main {

    public static void main(String[] args) {
        var carrinho = new Carrinho();

        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        MetodoPagamento metodoPagamento = new CartaoCredito("123123123");
//        MetodoPagamento metodoPagamento = new Transferencia("9999", "77777");


        carrinho.finalizar(metodoPagamento);
    }
}
