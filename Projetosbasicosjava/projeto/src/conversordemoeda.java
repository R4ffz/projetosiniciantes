import java.util.Scanner;
public class conversordemoeda {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           double valorreal, euro, dolar;
              System.out.println("Digite o valor em reais: ");
                valorreal = sc.nextDouble();
                euro = valorreal * 6.13;
                dolar = valorreal * 5.81;
                System.out.printf("O valor em euros é: %.2f%n", euro);
                System.out.printf("O valor em dólares é: %.2f%n", dolar);
        }
    }
}