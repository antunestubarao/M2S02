package m2s02ex01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira primeiro numero do intervalo:");
        int inicio = scanner.nextInt();

        System.out.print("Insira ultimo numero do intervalo:");
        int fim = scanner.nextInt();

        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        System.out.println("A soma de todos os números no intervalo [" + inicio + ", " + fim + "] é: " + soma);
    }
}