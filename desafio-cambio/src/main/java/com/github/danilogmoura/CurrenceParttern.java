package com.github.danilogmoura;

public enum CurrenceParttern {
    DEFAULT("#,##0.00"),
    WITH_MONETARY_SYMBOL("¤ #,##0.00");

    private final String parttern;

    CurrenceParttern(String parttern) {
        this.parttern = parttern;
    }

    public String getParttern() {
        return this.parttern;
    }
}
