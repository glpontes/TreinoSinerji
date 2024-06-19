package module8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {
        BinaryOperator<Double> avg =
                (a, b) -> (a + b) / 2;

        System.out.println(avg.apply(9.9, 5.3));

        BiFunction<Double, Double, String> resultado = (n1, n2) ->
                ((n1 + n2) / 2) >= 7? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(9.9, 5.3));
    }
}
