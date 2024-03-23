package com.github.danilogmoura.intefacesFuncionais;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Main2 {

    public static void main(String[] args) {

        IntPredicate predicate = value -> value < 10;
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(40));

        IntFunction<String> function = num -> "Número: " + num;
        System.out.println(function.apply(10));

        IntSupplier supplier = () -> 10;
        System.out.println(supplier.getAsInt());

        IntConsumer consumer = num -> System.out.println("Número: " + num);
        consumer.accept(19);
    }
}
