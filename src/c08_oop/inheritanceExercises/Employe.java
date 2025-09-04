package c08_oop.inheritanceExercises;

public class Employe {

    private String name;
    private double salary;

    public Employe(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    // Getters

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

}

