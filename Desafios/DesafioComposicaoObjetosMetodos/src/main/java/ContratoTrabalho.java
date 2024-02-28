public class ContratoTrabalho {

    private final Funcionario funcionario;

    private final double valorHoraNormal;

    private final double valorHoraExtra;

    public ContratoTrabalho(Funcionario funcionario, double valorHoraNormal, double valorHoraExtra) {
        this.funcionario = funcionario;
        this.valorHoraNormal = valorHoraNormal;
        this.valorHoraExtra = valorHoraExtra;
    }

    public boolean possuiAdicionalParaFilhos() {
        return funcionario.possuiFilhos();
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
