package com.github.danilogmoura.comercial;

public class LimiteDeCompraExcedidoException extends RuntimeException {
    public LimiteDeCompraExcedidoException(String message) {
        super(message);
    }
}
