package module8;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> menosDois = n -> n - 2;
        UnaryOperator<Integer> multiplicar = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado = maisDois
                .andThen(multiplicar)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(resultado);

        //nesse caso ele está fazendo na ordem de baixo para cima
        int resultado2 = aoQuadrado
                .compose(multiplicar)
                .compose(maisDois)
                .apply(0);
        System.out.println(resultado2);
    }
}
