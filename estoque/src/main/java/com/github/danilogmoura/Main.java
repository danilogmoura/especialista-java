package com.github.danilogmoura;

import com.github.danilogmoura.estoque.BaixaEstoqueException;
import com.github.danilogmoura.estoque.Produto;
import com.github.danilogmoura.estoque.ProdutoException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var produto = new Produto("Apple Watch");
        produto.ativar();
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
            } catch (BaixaEstoqueException e) {
                System.out.println("Erro na compra: " + e.getCause().getMessage());
//                e.printStackTrace();
            }
//            catch (ProdutoSemEstoqueException e) {
//                System.out.printf("Erro na compra: %s. Estoque disponível %d. Estoque necessário %d%n",
//                        e.getMessage(), e.getEstoqueDisponivel(), e.getEstoqueNecessario());
//            } catch (ProdutoIntativoException e) {
//                System.out.println("Erro na compra: " + e.getMessage());
//                System.out.print("Deseja ativar o produto? ");
//                if (scanner.nextBoolean()) {
//                    produto.ativar();
//                    System.out.println("Ok. Produto ativado");
//                } else {
//                    System.out.println("Ok. Compra não pode ser realizada");
//                    break;
//                }
//            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) throws BaixaEstoqueException {
        try {
            produto.retirarQuantidade(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidade, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException | ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao realizar baixa no estoque", e);
        }
    }
}
