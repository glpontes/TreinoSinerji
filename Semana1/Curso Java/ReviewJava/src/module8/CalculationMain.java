package module8;

public class CalculationMain {

    public static void main(String[] args) {

        Calculation calc = (x, y) -> { return x + y; };
        System.out.print(calc.execute(9,3));
    }
}
