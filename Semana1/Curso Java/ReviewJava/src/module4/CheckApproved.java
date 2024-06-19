package module4;

import java.util.Scanner;

public class CheckApproved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        double value1= sc.nextDouble();
        System.out.print("Enter the second value: ");
        double value2= sc.nextDouble();
        double avg = (value1+value2) / 2;
        System.out.printf("The average is %.2f ", avg);
        if (avg >= 7.0) {
            System.out.println("Approved");
        } else if (avg >= 4.0 && avg < 7.0) {
            System.out.println("Recovery");
        } else{
            System.out.println("Reproved");
        }
        sc.close();
    }
}
