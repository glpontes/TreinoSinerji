package module8;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(4));

        Function<String, String> oResultadoE =
                valor -> "Resultado: " + valor;

        String finalResult = parOuImpar
                .andThen(oResultadoE)
                .apply(32);

        System.out.println(finalResult);
    }
}
