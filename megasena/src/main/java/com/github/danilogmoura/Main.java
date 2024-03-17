package com.github.danilogmoura;

public class Main {
    public static void main(String[] args) {

        Sorteador sorteador = new Sorteador();

        for (Integer numeroSorteado : sorteador) {
            System.out.println(numeroSorteado);
        }

//        Iterator<Integer> sorteadorInterator = sorteador.iterator();
//        while (sorteadorInterator.hasNext()) {
//            System.out.println(sorteadorInterator.next());
//        }

//        System.out.println(sorteadorInterator.next());
    }
}
