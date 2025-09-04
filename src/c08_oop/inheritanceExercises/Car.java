package c08_oop.inheritanceExercises;

public class Car extends Vehicle {

    public Car() {

    }

    public void honk() {
        System.out.println("El carro toca la bocina");
    }

    @Override
    public void describe() {
        System.out.println("Esta es la descripción del carro");
    }
}

