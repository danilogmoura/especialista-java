package com.github.danilogmoura.basico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.github.danilogmoura.PathsFiles.DEFAULT;

public class Main6 {
    public static void main(String[] args) throws IOException {
        Path arquivoContrato = Path.of(DEFAULT, "docs\\contratos\\fornecedores\\contrato002.txt");
//        Files.delete(arquivoContrato);
        Files.deleteIfExists(arquivoContrato);

        Path pastaFornecedores = Path.of(DEFAULT, "docs\\contratos\\fornecedores");
//        Files.delete(pastaFornecedores);

        Path pastaClientes = Path.of(DEFAULT, "docs\\contratos\\clientes");
        Files.delete(pastaClientes);
    }
}
