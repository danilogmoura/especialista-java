import java.util.Arrays;

public class Calculadora {

    static double calcularMedia(double numeroA, double numeroB, double... outros) {
        double[] todosOsNumeros = Arrays.copyOf(outros, outros.length + 2);
        todosOsNumeros[todosOsNumeros.length - 2] = numeroA;
        todosOsNumeros[todosOsNumeros.length - 1] = numeroB;

        double soma = 0;
        for (double numero : todosOsNumeros) {
            soma += numero;
        }

        return soma / todosOsNumeros.length;
    }
}
