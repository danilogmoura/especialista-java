package com.github.danilogmoura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public void cadastrar(String codigo, String descricao) {
        var arquivo = Path.of("f:\\temp\\" + codigo + ".txt");

        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {
            throw new CadastroAnuncioException("Erro na escrita do arquivo de anuncio", e);

            // É melhor usar uma biblioteca de log para fazer isso
//            System.out.println("Erro escrevendo arquivo. Ignorando...");
//            e.printStackTrace();
        }
    }
}
