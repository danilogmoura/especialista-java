package com.github.danilogmoura.repository.comercial.servico;

import com.github.danilogmoura.repository.comercial.entidade.Venda;
import com.github.danilogmoura.repository.comercial.repositorio.VendaRepositorio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class CadastroVendaServico {

    private final VendaRepositorio vendaRepositorio;

    public CadastroVendaServico(VendaRepositorio vendaRepositorio) {
        this.vendaRepositorio = vendaRepositorio;
    }

    public Venda cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        Objects.requireNonNull(nomeCliente);

        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegocioException("Valor total deve ser maior que 0");
        }

        if (dataPagamento.isAfter(LocalDate.now())) {
            throw new NegocioException("Data do pagamento não ser ser uma data futura");
        }

        return vendaRepositorio.adicionar(new Venda(nomeCliente, valorTotal, dataPagamento));
    }
}
