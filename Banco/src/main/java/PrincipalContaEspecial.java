import com.github.danilogmoura.banco.ContaEspecial;
import com.github.danilogmoura.banco.Titular;

public class PrincipalContaEspecial {

    public static void main(String[] args) {
        var titular = new Titular("João da Silva", "12234523");

        var conta = new ContaEspecial(titular, 1234, 999999, 90);
        conta.setLimiteChequeEspecial(1000);

        conta.imprimirDemonstrativo();

        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(200);
        conta.imprimirDemonstrativo();

        conta.debitarTarifaMensal();
        conta.imprimirDemonstrativo();
    }
}
