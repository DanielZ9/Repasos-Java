package c08_oop.inheritanceExercises;

public class Eagle extends Bird {

    public Eagle() {

    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("El águila vuela");
    }
}
