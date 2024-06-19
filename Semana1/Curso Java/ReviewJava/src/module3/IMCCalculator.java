package module3;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        if (peso > 0 && altura > 0){
            double IMC = peso / (altura * altura);
            System.out.printf("IMC: %.2f", IMC);
        } else {
            System.out.println("Dados inválidos, o peso e a altura tem que ser positivo!");
        }
        sc.close();
    }
}
