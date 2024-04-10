package com.github.danilogmoura.repository.comercial.repositorio;

import com.github.danilogmoura.repository.comercial.entidade.Venda;

import java.util.List;

public interface VendaRepositorio {
    Venda adicionar(Venda venda);

    List<Venda> consultar();
}
