package c08_oop.accessModifiersExercises;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        setBalance(balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("nuevo saldo: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("nuevo saldo: " + balance);
        } else
            System.out.println("retiro no valido.");

    }

    // Getters

    public double getBalance() {
        return balance;
    }

    // Setters

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
