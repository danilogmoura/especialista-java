package com.github.danilogmoura;

import java.util.Comparator;

public class IdateContatoComparator implements Comparator<Contato> {

    @Override
    public int compare(Contato o1, Contato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
