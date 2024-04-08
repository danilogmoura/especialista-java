package com.github.danilogmoura.aulas;

import com.github.danilogmoura.entidades.Funcionario;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;

import static com.github.danilogmoura.FilesPath.OBJETOS;
import static java.nio.file.StandardOpenOption.READ;

public class Main2 {
    public static void main(String[] args) {

        var path = OBJETOS.resolve("Joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Funcionario funcionario = (Funcionario) inputStream.readObject();
            System.out.println(funcionario);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}