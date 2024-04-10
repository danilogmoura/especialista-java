package com.github.danilogmoura.repository.comercial.repositorio;

import com.github.danilogmoura.repository.comercial.repositorio.memoria.MemoriaFabricaDeRepositorio;
import com.github.danilogmoura.repository.comercial.repositorio.mysql.MySQLFabricaDeDepositorio;

import java.io.IOException;
import java.util.Properties;

public interface FabricaDeDepositorio extends AutoCloseable {

    static FabricaDeDepositorio obterInstancia() {
        var properties = new Properties();
        try (var is = FabricaDeDepositorio.class.getResourceAsStream("/persistencia.properties")) {
            properties.load(is);
        } catch (IOException e) {
            throw new PersistenciaException("Erro carregando configurações", e);
        }

        if ("mysql".equalsIgnoreCase(properties.getProperty("repositorio"))) {
            return new MySQLFabricaDeDepositorio(properties);
        } else if ("memoria".equalsIgnoreCase(properties.getProperty("repositorio"))) {
            return new MemoriaFabricaDeRepositorio();
        }

        throw new PersistenciaException("Implementação de repositório não existe");
    }

    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();
}
