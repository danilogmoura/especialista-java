package com.github.danilogmoura.companhiaAerea;

import java.util.Objects;
import java.util.Optional;

public class Reserva {

    private final String codigo;
    private final Voo voo;
    private final Passageiro passageiro;
    private int qunatidadeBagagens;

    public Reserva(String codigo, Voo voo, String nomePassageiro) {
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(voo);
        Objects.requireNonNull(nomePassageiro);
        this.codigo = codigo;
        this.voo = voo;
        this.passageiro = new Passageiro(nomePassageiro);
    }

    public String getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public Optional<Passageiro> getPassageiro() {
        return Optional.of(passageiro);
    }

    public int getQunatidadeBagagens() {
        return qunatidadeBagagens;
    }

    public void adicionarBagagens(int qunatidadeBagagens) {
        this.qunatidadeBagagens += qunatidadeBagagens;
    }

    @Override
    public String toString() {
        return "Reserva{" +
               "codigo='" + codigo + '\'' +
               ", voo=" + voo +
               ", passageiro=" + passageiro +
               ", qunatidadeBagagens=" + qunatidadeBagagens +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(codigo, reserva.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
