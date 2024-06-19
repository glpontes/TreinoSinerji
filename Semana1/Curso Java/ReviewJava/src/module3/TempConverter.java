package module3;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            sc.next(); // Limpa a entrada inválida
            System.out.print("Digite a temperatura em Fahrenheit: ");
        }
        double fahrenheit = sc.nextDouble();
        double celsius = converterFahrenheitParaCelsius(fahrenheit);
        System.out.printf("A temperatura em Celsius é %.1f\n", celsius);

        System.out.print("Digite a temperatura em Celsius: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            sc.next(); // Limpa a entrada inválida
            System.out.print("Digite a temperatura em Celsius: ");
        }
        celsius = sc.nextDouble();
        fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.printf("A temperatura em Fahrenheit é %.1f\n", fahrenheit);

        sc.close();
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
