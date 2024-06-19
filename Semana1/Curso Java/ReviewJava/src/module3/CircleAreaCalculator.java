package module3;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        if (raio > 0) {
            double area = Math.PI * raio * raio;
            System.out.printf("A área do círculo é: %.2f", area);
        } else {
            System.out.println("Valor inválido, o raio tem que ser positivo.");
        }

        sc.close();
    }
}
