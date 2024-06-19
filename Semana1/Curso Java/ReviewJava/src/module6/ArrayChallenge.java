package module6;


import java.util.Scanner;

//o user informa quantas notas quer informar e criar um array com esse tamanho
// dps o user informa nota a nota
// depois percorrer o array com for each somando as notas
// depois fazer a media
public class ArrayChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas você quer cadastrar?");
        int sizeArray = sc.nextInt();
        double[] notas = new double[sizeArray];
        System.out.println("Quantidade de notas do array: " + sizeArray);
        System.out.println("Agora vamos inserir as notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota: " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double total = 0;
        for(double nota: notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.printf("Média: %.2f", media);
        sc.close();

    }

}
