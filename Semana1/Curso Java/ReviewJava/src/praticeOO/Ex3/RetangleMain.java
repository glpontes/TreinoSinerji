package praticeOO.Ex3;

import praticeOO.Ex1.Circle;

import java.util.Scanner;

public class RetangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height and width respectively ");
        Retangle r1 = new Retangle(sc.nextDouble(), sc.nextDouble());

        r1.calculateArea();
        System.out.println(r1.toString());
    }
}
