package module4;

import java.util.Scanner;

//este código é apenas para identificar o maior valor inserido em 11 inserções!
public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int contador = 0;

        do{
            System.out.println("Digite um número:");
            int valor = sc.nextInt();
            if(valor > maior){
                maior = valor;
            }
            contador ++;

        } while (contador < 11);

        System.out.println(maior);

        sc.close();
    }
}
