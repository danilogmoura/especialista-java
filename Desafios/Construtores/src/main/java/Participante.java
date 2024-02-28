import java.util.Objects;

public class Participante {

    private final String nome;

    private final int saldoDePontos;

    public Participante(String nome) {
        this(nome, 0);
    }

    public Participante(String nome, int saldoDePontos) {
        Objects.requireNonNull(nome, "Nome não pode ser vazio");

        if (saldoDePontos < 0) {
            throw new IllegalArgumentException("Saldo inicial de pontos não pode ser negativo");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

    public String getNome() {
        return nome;
    }

    public int getSaldoDePontos() {
        return saldoDePontos;
    }
}
