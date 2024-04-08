package com.github.danilogmoura.desafio;

import com.github.danilogmoura.entidades.Cliente;
import com.github.danilogmoura.entidades.Endereco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;

import static com.github.danilogmoura.FilesPath.OBJETOS;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Serializacao {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);
        var path = OBJETOS.resolve("Cliente_Joao.ser");

        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(cliente);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
