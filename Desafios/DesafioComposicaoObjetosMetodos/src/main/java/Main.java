public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Squirley", 1);

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho(funcionario, 24.1, 23.6);

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        Holerite holerite = folhaPagamento.calcularSalario(128.0, 12.3, contratoTrabalho);
        holerite.imprimir();
    }
}
