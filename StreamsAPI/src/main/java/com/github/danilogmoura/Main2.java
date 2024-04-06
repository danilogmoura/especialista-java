package com.github.danilogmoura;

import java.util.Objects;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
//        Stream.of("João", null, "Maria", null)
//                .filter(nome -> nome != null)
//                .forEach(System.out::println);

        Stream.of("João", null, "Maria", null)
                .filter(Objects::isNull)
                .forEach(System.out::println);
    }
}
