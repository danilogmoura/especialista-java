package com.github.danilogmoura.repository.comercial.repositorio.memoria;

import com.github.danilogmoura.repository.comercial.entidade.Venda;
import com.github.danilogmoura.repository.comercial.repositorio.VendaRepositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoriaVendaRepositorio implements VendaRepositorio {

    private static final List<Venda> vendas = new ArrayList<>();
    private static long proximoId = 1L;

    @Override
    public Venda adicionar(Venda venda) {
        var novaVenda = new Venda(proximoId++, venda.getNomeCliente(), venda.getValorTotal(), venda.getDataPagamento());
        vendas.add(novaVenda);
        return novaVenda;
    }

    @Override
    public List<Venda> consultar() {
        return Collections.unmodifiableList(vendas);
    }
}
