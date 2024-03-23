package com.github.danilogmoura.introducao.crm;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}
