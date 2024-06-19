package module4;

import java.util.Scanner;

//este código é apenas uma prática de laços while.
public class NumeroPositivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.println("Digite um inteiro, negativo sairá do código");
            numero = sc.nextInt();
            if (numero > 0) {
                total += numero;
                System.out.println("Total " + total);
            }
        }
        sc.close();
    }
}
