package com.github.danilogmoura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(30);
        numeros.add(1);

//        Collections.sort(numeros);
        Collections.sort(numeros, Comparator.reverseOrder());

        System.out.println(numeros);
    }
}
