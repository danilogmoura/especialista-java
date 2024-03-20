package com.github.danilogmoura.calendar;

import java.util.Calendar;

public class Main3 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

//        calendar.set(Calendar.MONTH, Calendar.DECEMBER);

        calendar.add(Calendar.MONTH, 1);

        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);

        System.out.println(calendar.getTime());
    }
}
