// Programa simples que calcula o IMC de uma pessoa e informa a sua classificação
import java.util.Scanner;
public class imc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double peso, altura, imc;
            System.out.println("Digite o seu peso: ");
            peso = sc.nextDouble();
            System.out.println("Digite a sua altura: ");
            altura = sc.nextDouble();
            imc = peso / (altura * altura);
            if ( imc < 18.5 ) {
                System.out.println("Abaixo do peso");
            } else if ( imc >= 18.5 && imc < 25 ) {
                System.out.println("Peso normal");
            } else if ( imc >= 25 && imc < 30 ) {
                System.out.println("Sobrepeso");
            } else if ( imc >= 30 && imc < 35 ) {
                System.out.println("Obesidade grau 1");
            } else if ( imc >= 35 && imc < 40 ) {
                System.out.println("Obesidade grau 2");
            } else {
                System.out.println("Obesidade grau 3");
            }
        }
    }
}