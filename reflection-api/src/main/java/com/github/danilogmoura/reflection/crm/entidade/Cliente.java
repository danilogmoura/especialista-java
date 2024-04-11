package com.github.danilogmoura.reflection.crm.entidade;

import com.github.danilogmoura.reflection.csv.Campo;

import java.time.LocalDate;

public class Cliente {

    @Campo
    private final Long codigo;
    @Campo(maiusculo = true)
    private final String nome;
    private final LocalDate dataNascimento;

    public Cliente(Long codigo, String nome, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}