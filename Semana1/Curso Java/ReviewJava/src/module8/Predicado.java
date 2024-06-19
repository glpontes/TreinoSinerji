package module8;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Product> isExpensive =
                prod -> (prod.preco * (1 - prod.desconto)) >= 1000;

        Product product = new Product("Iphone", 2253, 0.1);

        System.out.println(isExpensive.test(product));
    }
}
