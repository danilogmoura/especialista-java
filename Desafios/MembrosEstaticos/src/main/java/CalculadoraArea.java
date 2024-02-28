public class CalculadoraArea {

    private static final double PI = 3.14159265358979323846;

    private CalculadoraArea() {
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }

}
