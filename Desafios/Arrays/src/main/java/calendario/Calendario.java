package calendario;

public class Calendario {

    static final String[] NOME_MESES = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    static String obterNomeMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            return null;
        }

        return NOME_MESES[numeroMes - 1];
    }
}