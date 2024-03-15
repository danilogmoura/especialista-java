package com.github.danilogmoura;

import com.github.danilogmoura.estoque.Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var produto = new Produto("Apple Watch");
//        produto.ativar();
        produto.adicionaEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        var scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Quantidade: ");
                var quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");

                break;
            } catch (IllegalArgumentException iae) {
                iae.printStackTrace();
                System.out.println("Erro na compra: " + iae.getMessage());
            } catch (IllegalStateException ise) {
                System.out.println("Erro na compra: " + ise.getMessage());
                System.out.print("Deseja ativar o produto? ");
                if (scanner.nextBoolean()) {
                    produto.ativar();
                    System.out.println("Ok. Produto ativado");
                } else {
                    System.out.println("Ok. Compra não pode ser realizada");
                    break;
                }
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
//        try {
        produto.retirarQuantidade(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                quantidade, produto.getQuantidadeEstoque());
//        } catch (IllegalArgumentException iae) {
//            System.out.println("Erro ao efetuar baixa no extoque: " + iae.getMessage());
//            throw iae;
//        }
    }
}
