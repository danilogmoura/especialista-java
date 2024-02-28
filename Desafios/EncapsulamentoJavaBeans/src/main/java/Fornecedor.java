import java.io.Serializable;
import java.util.Objects;

public class Fornecedor implements Serializable {

    private String nome;


    public Fornecedor() {
    }

    public Fornecedor(String nome) {
        Objects.requireNonNull(nome, "Atributo mome não deve ser vazio");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
