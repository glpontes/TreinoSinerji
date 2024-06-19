package module9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MapPratice {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("Audi","\nBMW", "\\nPagani");
        brands.stream().map(String::toUpperCase).forEach(print);

        UnaryOperator<String> upperCase = n -> n.toUpperCase();
        UnaryOperator<String> firstChar = n -> n.charAt(0) +"";
        UnaryOperator<String> shout = n -> n + "!!!";

    }
}
