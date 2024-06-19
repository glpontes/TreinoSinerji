package module3;

import java.util.Scanner;

public class CalculatorChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor 1 ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o valor 2 ");
        double valor2 = sc.nextDouble();

        System.out.println("Digite a operação: \n + \n - \n * \n / ");
        String operacao = sc.next();

        double finalResult = 0.0;
        boolean operacaoValida = true;

        switch(operacao){
            case "+":
                finalResult = valor1 + valor2;
                break;
            case "-":
                finalResult = valor1 - valor2;
                break;
            case "*":
                finalResult = valor1 * valor2;
                break;
            case "/":
                if (valor2 != 0){
                    finalResult = valor1 / valor2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.printf("%.2f %s %.2f = %.2f\n", valor1, operacao, valor2, finalResult);
        } else {
            System.out.println("Por favor, corrija os valores e tente novamente.");
        }

        sc.close();
    }
}
