package module3;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a área do triângulo...");
        System.out.println("Digite o tamanho da base:");
        double base = sc.nextDouble();

        System.out.print("Digite o tamanho da altura: ");
        double altura= sc.nextDouble();

        if(base > 0 && altura > 0) {
            double area = (base * altura) / 2;
            System.out.println("A área do triângulo é = " + area);
        } else {
            System.out.println("Valores inválido");
        }

        sc.close();
    }
}
