package c08_oop.inheritanceExercises;

public class Bird extends Animal {

    public Bird() {

    }

    @Override
    public void makeSound() {
        System.out.println("grita");
    }

    public void fly() {
        System.out.println("El ave vuela");
    }

}

