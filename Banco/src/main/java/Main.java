import com.github.danilogmoura.banco.Conta;
import com.github.danilogmoura.banco.Titular;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("João da Silva", "12234523"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.ddepositar(100);

        conta1.imprimirDemonstrativo();

        conta1.sacar(27.50);

        conta1.imprimirDemonstrativo();
    }
}
