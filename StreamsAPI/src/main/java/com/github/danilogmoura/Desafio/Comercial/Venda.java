package com.github.danilogmoura.Desafio.Comercial;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Venda {

    private final Integer codigo;
    private final LocalDate data = LocalDate.now();
    private final Cliente cliente;
    private final List<Item> itens = new ArrayList<>();
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private Status status = Status.RASCUNHO;

    public Venda(Integer codigo, Cliente cliente) {
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(cliente);
        this.cliente = cliente;
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public Status getStatus() {
        return status;
    }

    public boolean isFechada() {
        return Status.FECHADA.equals(status);
    }

    public boolean isCancelada() {
        return Status.CANCELADA.equals(status);
    }

    public boolean isRascunho() {
        return Status.RASCUNHO.equals(status);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        calcularValorTotal();
    }

    public void fechar() {
        status = Status.FECHADA;
    }

    public void cancelar() {
        status = Status.CANCELADA;
    }

    private void calcularValorTotal() {
        this.valorTotal = itens.stream()
                                  .map(Item::calcularValorTotal)
                                  .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String toString() {
        return "Venda{" +
               "codigo=" + codigo +
               ", data=" + data +
               ", valorTotal=" + valorTotal +
               ", cliente=" + cliente +
               ", itens=" + itens +
               ", status=" + status +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(codigo, venda.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public enum Status {
        RASCUNHO, FECHADA, CANCELADA
    }

    public record Item(String descricao, int quantidade, BigDecimal precoUnitario) {
        public BigDecimal calcularValorTotal() {
            return precoUnitario.multiply(new BigDecimal(quantidade));
        }
    }
}
