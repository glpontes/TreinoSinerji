package module4;

import java.util.Scanner;

public class ScaleAndPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        if (number % 2 == 0 && number >= 0 && number <= 10) {
            System.out.println("The number is even");
        } else if (number % 3 != 0) {
            System.out.println("The number is odd");
        } else{
            System.out.println("The number is out of scale");
        }

        sc.close();
    }
}
