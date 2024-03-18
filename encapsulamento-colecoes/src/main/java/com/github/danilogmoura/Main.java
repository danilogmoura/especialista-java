package com.github.danilogmoura;

import com.github.danilogmoura.comercial.Cliente;
import com.github.danilogmoura.comercial.ItemVenda;
import com.github.danilogmoura.comercial.Venda;

public class Main {

    public static void main(String[] args) {
        var mouse = new ItemVenda("Magic mouse", 700);
        var adaptadorUsb = new ItemVenda("Adaptador USB", 400);
        var macbook = new ItemVenda("Macbook Pro", 15_000);
        var limpaTela = new ItemVenda("Limpa tela", 70);

        var cliente = new Cliente("João da Silva", 2_000);
        var venda = new Venda(cliente);

        venda.adicionarItem(mouse);
        venda.adicionarItem(adaptadorUsb);
        venda.adicionarItem(limpaTela);
//        venda.adicionarItem(macbook);

        var itens = venda.getItens();
        itens.add(macbook);

//        System.out.println(venda.getValorTotal());
        System.out.println(venda.getItens());
        System.out.println(itens);
    }
}
