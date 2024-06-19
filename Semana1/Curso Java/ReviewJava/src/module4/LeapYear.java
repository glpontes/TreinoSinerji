package module4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            sc.next(); // Limpa a entrada inválida
            System.out.print("Digite um ano: ");
        }
        int ano = sc.nextInt();

        if (isLeapYear(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        sc.close();
    }

    public static boolean isLeapYear(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}