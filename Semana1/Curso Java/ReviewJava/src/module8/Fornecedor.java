package module8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {
        Supplier<List<String>> Lista =
                () -> Arrays.asList("Gabriel", "Pablo", "Ryan");

        System.out.println(Lista.get());
    }
}
