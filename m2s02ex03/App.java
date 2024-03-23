package m2s02ex03;

public class App {
    public static void main(String[] args) {
        double[] notas = { 6.5, 7.0, 8.5, 5.0, 6.0, 7.5, 8.0, 6.5, 9.0, 7.5 };

        double media = calcularMedia(notas);

        System.out.println("A média das notas é: " + media);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
