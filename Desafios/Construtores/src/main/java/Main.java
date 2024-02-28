public class Main {
    public static void main(String[] args) {
        Participante participante1 = new Participante("João");
        Participante participante2 = new Participante("Maria", 10_000);

        System.out.printf("%s tem %d pontos%n", participante1.getNome(), participante1.getSaldoDePontos());
        System.out.printf("%s tem %d pontos%n", participante2.getNome(), participante2.getSaldoDePontos());
    }
}
