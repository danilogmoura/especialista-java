public class Main {

    public static void main(String[] args) {
        var areaQuadrado = CalculadoraArea.calcularAreaQuadrado(5.2);
        var areaCirculo = CalculadoraArea.calcularAreaCirculo(10.5);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }
}
