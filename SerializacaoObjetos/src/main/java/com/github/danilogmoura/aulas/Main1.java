package com.github.danilogmoura.aulas;

import com.github.danilogmoura.entidades.Funcionario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static com.github.danilogmoura.FilesPath.OBJETOS;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Main1 {
    public static void main(String[] args) {
        var funcionario = new Funcionario(
                "João",
                LocalDate.of(2005, Month.MARCH, 2),
                new BigDecimal("25000"));

        System.out.println(funcionario);

        Path path = OBJETOS.resolve("Joao.ser");

//        try (var outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
//            outputStream.writeObject(funcionario);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}