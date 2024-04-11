package com.github.danilogmoura.reflection.csv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {

    public static <T> void imprimir(Class<T> clazz, List<T> objetos) {
        Field[] campos = clazz.getDeclaredFields();

        System.out.println(Arrays.stream(campos)
                                   .filter(campo -> campo.isAnnotationPresent(Campo.class))
                                   .map(Field::getName)
                                   .collect(Collectors.joining(";")));

        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Object cliente) {
        Field[] campos = cliente.getClass().getDeclaredFields();
        List<String> valores = new ArrayList<>();

        try {
            for (Field campo : campos) {
                if (campo.isAnnotationPresent(Campo.class)) {
                    Campo anotacaoCampo = campo.getAnnotation(Campo.class);
                    campo.setAccessible(true);
                    Object resultado = campo.get(cliente);
                    var resultadoString = resultado == null ? "" : resultado.toString();
                    valores.add(anotacaoCampo.maiusculo() ? resultadoString.toUpperCase() : resultadoString);
                }
            }

            System.out.println(String.join(";", valores));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}