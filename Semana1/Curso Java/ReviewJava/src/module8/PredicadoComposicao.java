package module8;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer>  has3Digits = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(has3Digits).test(245));
        System.out.println(isPar.or(has3Digits).test(245));

    }
}
