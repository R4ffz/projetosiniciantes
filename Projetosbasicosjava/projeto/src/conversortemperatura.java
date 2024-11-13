import java.util.Scanner;
public class conversortemperatura {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double celsius, fahrenheit, kelvin;
            System.out.println("Digite a temperatura em graus Celsius: ");
            celsius = sc.nextDouble();
            fahrenheit = celsius * 1.8 + 32;
            kelvin = celsius + 273.15;
            System.out.printf("A temperatura em Fahrenheit é: %.2f%n", fahrenheit);
            System.out.printf("A temperatura em Kelvin é: %.2f%n", kelvin);
        }
    }
}