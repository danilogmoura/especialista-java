import com.github.danilogmoura.banco.Conta;
import com.github.danilogmoura.banco.Titular;

public class ContaEspecial {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setTitular(new Titular("João da Silva", "12234523"));
        conta.setAgencia(1234);
        conta.setNumero(999999);
        conta.setTipo(Conta.ESPECIAL);
        conta.setLimiteChequeEspecial(1000);
        conta.setTarifaMensal(90);

        conta.imprimirDemonstrativo();

        conta.depositar(100);

        conta.imprimirDemonstrativo();

        conta.sacar(200);
        conta.debitarTarifaMensal();
        conta.imprimirDemonstrativo();
    }
}
