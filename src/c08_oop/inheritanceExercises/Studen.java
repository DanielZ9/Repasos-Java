package c08_oop.inheritanceExercises;

public class Studen extends Person {

    private int grade;

    public Studen(String name, int age, int grade) {
        super(name, age);
    }

    public void study() {
        System.out.println(getName() + " se encuentra estudiante");
    }
}
