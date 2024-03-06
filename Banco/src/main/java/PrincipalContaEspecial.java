import com.github.danilogmoura.banco.ContaEspecial;
import com.github.danilogmoura.banco.Titular;

public class PrincipalContaEspecial {

    public static void main(String[] args) {
        var conta = new ContaEspecial();
        conta.setTitular(new Titular("João da Silva", "12234523"));
        conta.setAgencia(1234);
        conta.setNumero(999999);
        conta.setLimiteChequeEspecial(1000);
        conta.setTarifaMensal(90);

        conta.imprimirDemonstrativo();
        
        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(200);
        conta.imprimirDemonstrativo();

        conta.debitarTarifaMensal();
        conta.imprimirDemonstrativo();
    }
}
