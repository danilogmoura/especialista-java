import com.github.danilogmoura.banco.Conta;
import com.github.danilogmoura.banco.Titular;

public class PrincipalContaNormal {

    public static void main(String[] args) {
        var conta = new Conta();
        conta.setTitular(new Titular("João da Silva", "12234523"));
        conta.setAgencia(1234);
        conta.setNumero(999999);

        conta.imprimirDemonstrativo();

        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(27.50);
        conta.imprimirDemonstrativo();
    }
}
