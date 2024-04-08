package com.github.danilogmoura.desafio;

import com.github.danilogmoura.FilesPath;
import com.github.danilogmoura.entidades.Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;

public class Desserializacao {
    public static void main(String[] args) {
        var path = FilesPath.OBJETOS.resolve("Cliente_Joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Cliente cliente = (Cliente) inputStream.readObject();
            System.out.println(cliente);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
