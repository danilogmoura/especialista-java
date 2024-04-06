package com.github.danilogmoura.basico.estoque;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Produto {

    private final Fabricante fabricante;
    private final Set<Categoria> categorias = new HashSet<>();
    private String nome;
    private BigDecimal preco;
    private int quantidade;
    private Status status = Status.ATIVO;

    public Produto(String nome, BigDecimal preco, int quantidade, Fabricante fabricante, Categoria... categorias) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fabricante = fabricante;
        this.categorias.addAll(Set.of(categorias));
    }

    public Produto(String nome, BigDecimal preco, int quantidade, Fabricante fabricante, Status status, Categoria... categorias) {
        this(nome, preco, quantidade, fabricante, categorias);
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Status getStatus() {
        return status;
    }

    public void inativar() {
        this.status = Status.INATIVO;
    }

    public void ativar() {
        this.status = Status.ATIVO;
    }

    public boolean isInativo() {
        return Status.INATIVO.equals(status);
    }

    public boolean isAtivo() {
        return Status.ATIVO.equals(status);
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Set<Categoria> getCategorias() {
        return Collections.unmodifiableSet(categorias);
    }

    public void adicionarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public void removerCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }

    public boolean temEstoque() {
        return getQuantidade() > 0;
    }

    public BigDecimal getValoEstoque() {
        return getPreco().multiply(new BigDecimal(getQuantidade()));
    }

    @Override
    public String toString() {
        return "Produto{" +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               ", quantidade=" + quantidade +
               ", status=" + status +
               ", fabricante=" + fabricante +
               ", categorias=" + categorias + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public enum Status {
        ATIVO, INATIVO
    }
}
