package module3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PraticaConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> valores = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite o valor %d (use vírgula ou ponto como separador decimal): ", i);
            while (true) {
                String input = sc.nextLine().replace(",", ".");
                try {
                    Double valor = Double.parseDouble(input);
                    valores.add(valor);
                    break;
                } catch (NumberFormatException e) {
                    System.out.printf("Entrada inválida. Digite o valor %d novamente: ", i);
                }
            }
        }

        double media = calcularMedia(valores);

        System.out.printf("A média dos valores é: %.2f\n", media);
        sc.close();
    }

    public static double calcularMedia(List<Double> valores) {
        double soma = 0;
        for (Double valor : valores) {
            soma += valor;
        }
        return soma / valores.size();
    }
}