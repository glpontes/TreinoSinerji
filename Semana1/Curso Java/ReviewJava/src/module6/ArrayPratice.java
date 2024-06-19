package module6;

import java.util.Arrays;

public class ArrayPratice {
    public static void main(String[] args) {
        double [] notasAlunoA = new double [3];
        notasAlunoA[0] = 9.5;
        notasAlunoA[1] = 6.4;
        notasAlunoA[2] = 8.5;

        double media = (notasAlunoA[0] + notasAlunoA[1] + notasAlunoA[2]) / 3;
        System.out.printf("Média: %.2f \n", media);

        //ou

        double total = 0;
        for (int i = 0; i <  notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }

        //Ambos NESTA Situação imprimem o mesmo resultado, porém o uso do segundo método é mais lógico
        // já que o primeiro divide grotescamente, ignorando a possibilidade do array ter um tamanho maior.

        System.out.printf("Média: %.2f \n", total / notasAlunoA.length);

        System.out.println(Arrays.toString(notasAlunoA));

    }
}
