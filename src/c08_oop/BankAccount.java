package c08_oop;

public class BankAccount {

    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposito(int deposito) {
        balance += deposito;
        System.out.println("Su nuevo saldo es: " + balance);
    }

}
