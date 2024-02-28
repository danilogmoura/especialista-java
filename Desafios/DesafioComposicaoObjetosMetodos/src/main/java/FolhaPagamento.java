public class FolhaPagamento {


    public Holerite calcularSalario(double horasTrabalhadas, double horasExtras, ContratoTrabalho contratoTrabalho) {
        if (horasTrabalhadas < 0 || horasExtras < 0 || contratoTrabalho.getValorHoraNormal() < 0
                || contratoTrabalho.getValorHoraExtra() < 0) {
            throw new IllegalArgumentException("Valor não pode ser menor segativo");
        }

        double totalHorasNormais = horasTrabalhadas * contratoTrabalho.getValorHoraExtra();
        double totalhorasExtras = horasExtras * contratoTrabalho.getValorHoraExtra();
        double valorAdicionalFilhos = 0;

        if (contratoTrabalho.possuiAdicionalParaFilhos()) {
            valorAdicionalFilhos = (totalHorasNormais + totalhorasExtras) * 0.10;
        }

        return new Holerite(contratoTrabalho.getFuncionario(), totalHorasNormais, totalhorasExtras, valorAdicionalFilhos);
    }
}
