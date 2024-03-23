package com.github.danilogmoura.Desafio;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario {

    private final String nome;
    private final BigDecimal salario;
    private final Status status;


    public Funcionario(String nome, BigDecimal salario, Status status) {
        this.nome = nome;
        this.salario = salario;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public boolean isAtivo() {
        return status.isAtivo();
    }

    public boolean isInativo() {
        return status.isInativo();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
               "nome='" + nome + '\'' +
               ", salario=" + salario +
               ", status=" + status +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public enum Status {
        ATIVO,
        INATIVO;

        public boolean isAtivo() {
            return this.equals(ATIVO);
        }

        public boolean isInativo() {
            return this.equals(INATIVO);
        }
    }
}
