package com.github.danilogmoura.desafio;

import com.github.danilogmoura.FilesPath;
import com.github.danilogmoura.entidades.Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;

public class Desserializacao {
    public static void main(String[] args) {
        Cliente cliente = null;

        var path = FilesPath.OBJETOS.resolve("Cliente_Joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path))) {
            cliente = (Cliente) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(cliente);
    }
}
