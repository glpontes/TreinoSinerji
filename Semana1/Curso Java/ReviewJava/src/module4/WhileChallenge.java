package module4;

import java.util.Scanner;

public class WhileChallenge {
    public static void main(String[] args) {

        //calcular media das notas de alunos, o usuario digita uma nota de 0 a 10, a cada nota ele salva
        // na variavel nota e a cada valor inserido ele tem que contar para dividir no final e dar a media
        Scanner in = new Scanner(System.in);
        int contador = 0;
        double total = 0;
        double nota = 0;
        while (nota !=-1) {
            System.out.println("Digite uma nota válida:  (ou -1 para sair)");
            nota = in.nextDouble();
            if (nota >= 0 && nota <= 10) {
                System.out.printf("Nota: %.2f registrada!", nota);
                System.out.printf("\nDeseja sair? se sim digite sair\n");

                total += nota;
                contador++;
            } else if (nota != -1){
                System.out.println("Nota inválida");
            }

        }
        double media = total / contador;
        System.out.printf("Media: %.2f", media);

        in.close();
    }
}
