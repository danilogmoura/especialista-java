package com.github.danilogmoura;

import com.github.danilogmoura.agencia.CadastroHotel;
import com.github.danilogmoura.agencia.Hotel;

public class Main2 {

    public static void main(String[] args) {


        var hotel1 = new Hotel("Vila Selvagem", "Fortim/CE", 1600);
        var hotel2 = new Hotel("Vila Selvagem", "Fortim/CE", 1500);

        System.out.println(hotel1.compareTo(hotel2));
    }
}
