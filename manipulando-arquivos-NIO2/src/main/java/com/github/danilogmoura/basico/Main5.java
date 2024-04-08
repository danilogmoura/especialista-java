package com.github.danilogmoura.basico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.github.danilogmoura.PathsFiles.DEFAULT;

public class Main5 {
    public static void main(String[] args) throws IOException {
        Path pastaFornecedor = Path.of(DEFAULT, "\\docs\\contratos\\fornecedores");
        Path pastaClientes = Path.of(DEFAULT, "\\docs\\contratos\\clientes");
        Path arquivoContrato = Path.of("contrato002.txt");

        Path arquivoContratoOrigem = pastaFornecedor.resolve(arquivoContrato);
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

//        Files.move(arquivoContratoOrigem, arquivoContratoDestino);

        Path pastaVendas = Path.of(DEFAULT, "\\docs\\vendas");

        Files.move(pastaClientes, pastaVendas);
    }
}
