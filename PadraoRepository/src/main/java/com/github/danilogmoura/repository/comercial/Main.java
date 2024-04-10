package com.github.danilogmoura.repository.comercial;

import com.github.danilogmoura.repository.comercial.repositorio.FabricaDeDepositorio;
import com.github.danilogmoura.repository.comercial.servico.CadastroVendaServico;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        try (var fabricaDeDepositorio = FabricaDeDepositorio.obterInstancia()) {
            var vendaRepositorio = fabricaDeDepositorio.criarVendaRepositorio();
            var cadastroVendaServico = new CadastroVendaServico(vendaRepositorio);

            var vendaCadastrada = cadastroVendaServico.cadastrar("José da Silva",
                    new BigDecimal("12300.87"), LocalDate.parse("2023-04-19"));
            System.out.println("Venda cadastrada: " + vendaCadastrada);

            System.out.println("Listando todas as vendas");
            var todasVendas = vendaRepositorio.consultar();
            todasVendas.forEach(System.out::println);
        }
    }
}