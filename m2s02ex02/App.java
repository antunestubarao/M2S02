package m2s02ex02;

import java.util.Scanner;

public class App {

    /*
     * A função isPrime() é chamada para verificar se o número inserido é primo.
     * Com base no retorno da função isPrime(), o programa imprime se o número é
     * primo ou não.
     */

    public static void main(String[] args) {
        if (isPrime()) {
            System.out.println("Seu número é primo.");
        } else {
            System.out.println("Seu número nao é primo.");
        }
    }

    /*
     * Solicitação de Entrada: Dentro da função, é solicitado ao usuário que insira
     * um número inteiro.
     * Leitura da Entrada: O número inserido pelo usuário é lido e armazenado na
     * variável num.
     * Verificação de Números Menores ou Iguais a 1: Se o número for menor ou igual
     * a 1, a função retorna false, pois números menores que 2 não são considerados
     * primos.
     * Loop de Verificação: Um loop for é utilizado para iterar de 2 até a raiz
     * quadrada do número inserido.
     * Divisibilidade: Verifica se o número é divisível por algum número dentro
     * desse intervalo.
     * Critério de Primalidade: Se o número for divisível por algum número diferente
     * de 1 e ele mesmo, a função retorna false.
     * Retorno de Primalidade: Se o número passar por todas as verificações sem ser
     * divisível por nenhum número dentro do intervalo, a função retorna true,
     * indicando que o número é primo.
     */

    public static boolean isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me diga qualquer número que lhe responderei se é primo: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

        /*
         * Se a função isPrime retornar true, o programa imprime que o número é primo.
         * Caso contrário, é impresso que o número não é primo.
         */
    }
}