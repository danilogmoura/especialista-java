public class NumeroUtil {
    private NumeroUtil() {
    }

    public static int descobrirMaior(int a, int b) {
        return a > b ? a : b;
    }

    public static int descobrirMaior(int a, int b, int c) {
        return descobrirMaior(descobrirMaior(a, b), c);
    }

    public static double descobrirMaior(double a, double b) {
        return a > b ? a : b;
    }

    public static double descobrirMaior(double a, double b, double c) {
        return descobrirMaior(descobrirMaior(a, b), c);
    }
}
