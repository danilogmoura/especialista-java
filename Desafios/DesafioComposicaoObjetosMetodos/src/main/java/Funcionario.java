public class Funcionario {
    private final String nome;

    private final int quantidadeFilhos;

    public Funcionario(String nome, int quantidadeFilhos) {
        if (quantidadeFilhos < 0) {
            throw new IllegalArgumentException("Quantidade de filhos não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public String getNome() {
        return nome;
    }

    public boolean possuiFilhos() {
        return quantidadeFilhos > 0;
    }
}
