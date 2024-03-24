package com.github.danilogmoura.TiposPrimitivos;

import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
        OptionalInt resultadoOptional = dividir(10, 2);

        resultadoOptional.ifPresentOrElse(
                resultado -> System.out.println("Resuldado: " + resultado),
                () -> System.out.println("Sem resultado"));
    }

    private static OptionalInt dividir(int x, int y) {

        if (y == 0) {
            return OptionalInt.empty();
        }

        return OptionalInt.of(x / y);
    }
}
