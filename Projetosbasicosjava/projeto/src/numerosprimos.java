// Programa simples que verifica se um número é primo ou não
import java.util.Scanner;
public class numerosprimos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.err.println("Digite um número: ");
            n = sc.nextInt();
            if (n % 2 == 0){
                System.out.println("O número " + n + " é primo");
            } else {
                System.out.println("O número " + n + " não é primo");
            }
        }
    }
}
