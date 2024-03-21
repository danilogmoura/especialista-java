package com.github.danilogmoura.datetimeapidesafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalcularParcelas {

    public static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final String dataPrimeiraParcela;
    private final int quantidadeDeParcelas;

    public CalcularParcelas(String dataPrimeiraParcela, int quantidadeDeParcelas) {
        Objects.requireNonNull(dataPrimeiraParcela);

        if (quantidadeDeParcelas < 1) {
            throw new IllegalArgumentException("Quantidade mínima de parcelas deve ser igual a 1");
        }

        this.dataPrimeiraParcela = dataPrimeiraParcela;
        this.quantidadeDeParcelas = quantidadeDeParcelas;
    }

    public List<LocalDate> calcular() {
        List<LocalDate> localDates = new ArrayList<>();

        for (int i = 0; i < quantidadeDeParcelas; i++) {
            localDates.add(
                    LocalDate.parse(dataPrimeiraParcela, DATE_PATTERN).plusMonths(i)
            );
        }
        return localDates;
    }
}
