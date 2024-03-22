package com.github.danilogmoura.month;

import java.time.Month;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(Month.DECEMBER.firstDayOfYear(true));
        System.out.println(Month.DECEMBER.firstDayOfYear(false));

        System.out.println(Month.FEBRUARY.length(true));
        System.out.println(Month.FEBRUARY.length(false));

        System.out.println(Month.SEPTEMBER.firstMonthOfQuarter());
    }
}
