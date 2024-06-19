package praticeOO.Ex2;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount(1,100.00,"Gabriel Leandro");
        c1.deposit(200.00);
        c1.withdraw(53.40);
        System.out.println(c1.getBalance());

    }
}
