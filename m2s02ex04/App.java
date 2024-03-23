package m2s02ex04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para gerar a tabela de multiplicação:");
        int numero = scanner.nextInt();

        System.out.println("Tabela de Multiplicação para o número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
