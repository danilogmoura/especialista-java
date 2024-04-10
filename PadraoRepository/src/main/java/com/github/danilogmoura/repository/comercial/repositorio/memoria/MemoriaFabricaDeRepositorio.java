package com.github.danilogmoura.repository.comercial.repositorio.memoria;

import com.github.danilogmoura.repository.comercial.repositorio.FabricaDeDepositorio;
import com.github.danilogmoura.repository.comercial.repositorio.VendaRepositorio;

public class MemoriaFabricaDeRepositorio implements FabricaDeDepositorio {

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MemoriaVendaRepositorio();
    }

    @Override
    public void close() {

    }
}
