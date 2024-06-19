package module3;

import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();

        double aoQuadrado = valor * valor;
        double aoCubo = valor * valor * valor;
        System.out.printf("Ao quadrado: %.2f\nAo cubo: %.2f", aoQuadrado, aoCubo);

        sc.close();
    }
}
