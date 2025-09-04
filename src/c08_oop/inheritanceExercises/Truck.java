package c08_oop.inheritanceExercises;

public class Truck extends Vehicle {

    @Override
    public void describe() {
        System.out.println("Esta es la descripción del camion");
    }
}
