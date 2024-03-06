import com.github.danilogmoura.banco.ContaInvestimento;
import com.github.danilogmoura.banco.Titular;

public class PrincipalContaInvestimento {

    public static void main(String[] args) {
        var conta = new ContaInvestimento();
        conta.setTitular(new Titular("João da Silva", "12234523"));
        conta.setAgencia(1234);
        conta.setNumero(999999);

        conta.imprimirDemonstrativo();

        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.creditarRendimento(6);
        conta.imprimirDemonstrativo();
    }
}
