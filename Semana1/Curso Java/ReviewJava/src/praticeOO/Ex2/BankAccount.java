package praticeOO.Ex2;

/*
Implemente uma classe chamada “BankAccount”
que possua atributos para armazenar o número da conta,
nome do titular e saldo. Adicione métodos para realizar
depósitos e saques.
*/

public class BankAccount {
    private int number;
    private double balance;
    private String name;
    private double amount;

    public BankAccount(int number, double balance, String name) {
        this.number = number;
        this.balance = balance;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
        } else{
            System.out.println("Invalid value");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
