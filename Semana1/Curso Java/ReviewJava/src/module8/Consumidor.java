package module8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Product> imprimir =
                p -> System.out.println(p.nome);

        Product p1 = new Product ("PC", 3259.00, 0.1);
        imprimir.accept(p1);

        Product p2 = new Product ("PC2", 2100.00, 0.1);
        Product p3 = new Product ("PC3", 4900.00, 0.1);
        Product p4 = new Product ("PC4", 5000.00, 0.1);

        List<Product> products = Arrays.asList(p1,p2,p3,p4);

        products.forEach(imprimir);
    }
}
