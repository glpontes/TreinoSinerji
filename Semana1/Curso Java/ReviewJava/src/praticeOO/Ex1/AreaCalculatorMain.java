package praticeOO.Ex1;

import java.util.Scanner;

public class AreaCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        Circle c1 = new Circle(sc.nextInt());

        c1.areaCalculate();
        System.out.println(c1.toString());
    }


}
