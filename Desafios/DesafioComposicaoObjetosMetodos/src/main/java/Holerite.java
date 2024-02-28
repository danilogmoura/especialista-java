public class Holerite {


    private final Funcionario funcionario;

    private final double valorTotalHorasNormais;

    private final double valorTotalHorasExtras;

    private final double adicionalParaFilhos;

    public Holerite(Funcionario funcionario, double valorTotalHorasNormais, double valorTotalHorasExtras, double adicionalParaFilhos) {
        this.funcionario = funcionario;
        this.valorTotalHorasNormais = valorTotalHorasNormais;
        this.valorTotalHorasExtras = valorTotalHorasExtras;
        this.adicionalParaFilhos = adicionalParaFilhos;
    }

    private double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + adicionalParaFilhos;
    }

    public void imprimir() {
        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.getNome());
        System.out.printf("Valor das horas normais: R$ %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor das horas extras: R$ %.2f%n", valorTotalHorasExtras);
        System.out.printf("Adicional para filhos: R$ %.2f%n", adicionalParaFilhos);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }
}




