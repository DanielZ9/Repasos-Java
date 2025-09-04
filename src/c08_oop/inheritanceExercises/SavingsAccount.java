package c08_oop.inheritanceExercises;

public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(double saldo, double interest) {
        super(saldo);
        setInterest(interest);
    }

    public void addInterest() {
        System.out.println("Su saldo con intereses es: " + (getSaldo() + (getSaldo() * (interest / 100))));
    }

    // Getters

    public double getInterest() {
        return interest;
    }

    // Setters

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
