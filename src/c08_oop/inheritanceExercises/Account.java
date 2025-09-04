package c08_oop.inheritanceExercises;

public class Account {

    private double saldo;

    public Account(double saldo) {
        setSaldo(saldo);
    }

    public void deposit(double amount) {
        this.saldo += amount;
        System.out.println("Su nuevo saldo es: " + this.saldo);
    }

    public void withdraw(double amount) {
        if ((this.saldo - amount) >= 0) {
            this.saldo -= amount;
            System.out.println("Su nuevo saldo es: " + this.saldo);
        } else
            System.out.println("El retiro excede el saldo.");
    }

    // Getters

    public double getSaldo() {
        return saldo;
    }

    // Setters

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

