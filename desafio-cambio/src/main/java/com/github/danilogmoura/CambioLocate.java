package com.github.danilogmoura;

import java.util.Locale;

public enum CambioLocate {

    US(Locale.US),
    PT_BR(Locale.of("pt", "BR"));

    private final Locale locale;

    CambioLocate(Locale locale) {
        this.locale = locale;
    }

    public Locale locale() {
        return this.locale;
    }
}
