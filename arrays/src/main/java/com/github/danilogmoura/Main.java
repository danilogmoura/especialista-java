package com.github.danilogmoura;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] numeros1 = {1, 2};
//        numeros1[0] = 4;

        List<Integer> numeros2 = Arrays.asList(numeros1);
//        numeros2.set(0, 4);

//        System.out.println(Arrays.toString(numeros1));
//        System.out.println(numeros2);

//        numeros2.add(2);

        for (int i = 0; i < numeros2.size(); i++) {
            System.out.println(numeros2.get(i));
        }
    }
}
