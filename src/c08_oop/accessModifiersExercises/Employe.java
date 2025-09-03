package c08_oop.accessModifiersExercises;

public class Employe {

    private double salary;

    public Employe(double salary) {
        setSalary(salary);
    }

    public void raiseSalary(double percent) {
        this.salary += this.salary * (percent / 100);
    }

    // Getters

    public double getSalary() {
        return salary;
    }

    // Setters

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else
            System.out.println("Salario " + salary + " Invalido");
    }

}
