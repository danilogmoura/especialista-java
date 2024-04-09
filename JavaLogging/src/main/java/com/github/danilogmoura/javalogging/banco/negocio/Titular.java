package com.github.danilogmoura.javalogging.banco.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;


public class Titular {

    private static final Logger logger = LoggerFactory.getLogger(Titular.class);

    private final String cpf;
    private String nome;

    public Titular(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);

        this.nome = nome;
        this.cpf = cpf;

        if (this.nome.length() < 5) {
            logger.warn("Nome do titular '{}' muito curto", nome);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Titular{" +
               "cpf='" + cpf + '\'' +
               ", nome='" + nome + '\'' +
               '}';
    }
}
