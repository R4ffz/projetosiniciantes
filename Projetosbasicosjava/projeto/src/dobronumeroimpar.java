//Programa que recebe um número ímpar e imprime o dobro desse número até que o número seja maior que 10000
import java.util.Scanner;

public class dobronumeroimpar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.println("Digite um número ímpar: ");
            n = sc.nextInt();
            if (n % 2 != 0) {
                for (; n <= 10000; n *= 2) {
                    System.out.println(n);
                }
            } else {
                System.out.println("O número digitado não é ímpar.");
            }
        }
    }
}
