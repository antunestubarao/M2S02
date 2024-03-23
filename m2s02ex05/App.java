package m2s02ex05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira qunatidade de numeros desejada:");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Insira agora números aleatoriamente e aperte enter para cada numero inserido:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        App(array);

        System.out.println("Invertendo seus números fica assim:");
        for (int num : array) {
            System.out.println(num + " ");
        }

    }

    public static void App(int[] array) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio < fim) {
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
    }
}
