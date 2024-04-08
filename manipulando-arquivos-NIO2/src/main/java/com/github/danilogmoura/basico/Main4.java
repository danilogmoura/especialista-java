package com.github.danilogmoura.basico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.github.danilogmoura.PathsFiles.DEFAULT;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Path pastaFornecedor = Path.of(DEFAULT, "\\docs\\contratos\\fornecedores");

        Path arquivoContrato = Path.of("contrato002.txt");
        Path arquivoContratoOrigem = pastaFornecedor.resolve(arquivoContrato);

        Path pastaClientes = Path.of(DEFAULT, "\\docs\\contratos\\clientes");
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

        Path pastaParceiros = Path.of(DEFAULT, "docs\\contratos\\parceiros");

        System.out.println(arquivoContratoOrigem);
        System.out.println(arquivoContratoDestino);

//        Files.copy(arquivoContratoOrigem, arquivoContratoDestino, REPLACE_EXISTING);

        Files.copy(pastaFornecedor, pastaParceiros);
    }
}
