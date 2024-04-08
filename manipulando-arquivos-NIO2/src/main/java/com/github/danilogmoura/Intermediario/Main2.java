package com.github.danilogmoura.Intermediario;

import java.nio.CharBuffer;

public class Main2 {
    public static void main(String[] args) {

        CharBuffer charBuffer = CharBuffer.allocate(1000);

        charBuffer.put('O');
        charBuffer.put('l');
        charBuffer.put('á');

        charBuffer.flip();
//        charBuffer.chars().forEach(c -> System.out.print((char) c));
        System.out.println(charBuffer);

//        System.out.println(Arrays.toString(charBuffer.array()));

    }
}
