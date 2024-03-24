package com.github.danilogmoura.companhiaAerea;

public class ReservaNaoEncontradaException extends RuntimeException {

    public ReservaNaoEncontradaException() {
    }

    public ReservaNaoEncontradaException(String message) {
        super(message);
    }
}
