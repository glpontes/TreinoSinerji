package module8.binaryOpChallenge;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;


/*
* Desafio
* 1. A partir do produto calcular o preco real (com desconto)
* 2. Importo municipal: >=2500 (8,5%) / < 2500 (isento)
* 3. Frete: >= 3000(100)/ < 3000(50)
* 4. Arredondar: Deixar duas casas decimais
* 5. Formatar: R$ 1234,56
*/

public class Challenge {

    public static void main(String[] args) {



        Function<Product, Double> finalPrice =
                prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> cityTax =
                preco -> preco >=2500 ? preco * 1.085 : preco ;
        UnaryOperator<Double> shippingCost =
                preco -> preco >=3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> round =
                preco -> new BigDecimal(preco).setScale(2, RoundingMode.HALF_UP).doubleValue();
        Function<Double, String> format =
                preco -> NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(preco);

        Product p = new Product("Ipad", 3235.89, 0.13);
        String price = finalPrice
                .andThen(cityTax)
                .andThen(shippingCost)
                .andThen(round)
                .andThen(format)
                .apply(p);

        System.out.println(price);

    }
}
