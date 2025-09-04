package c08_oop;

public class Abstraction {

    public static void main(String[] args) {

        // Abstracción

        // - Clase abstracta

        //var animal = new Animal(); // las clases abstractas no se pueden instanciar
        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface


    }

    // - Clase abstracta

    public static abstract class Animal {

        public abstract void sound();

        public void sleep() {
            System.out.println("El animal duerme");
        }

    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep() {
            System.out.println("El perro esta durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }

        @Override
        public void sleep() {
            System.out.println("El gato esta durmiendo");
        }
    }

    // - Interface

    public interface Flying {

        void fly();

    }

    public interface Flying2 {

        void fly2();

    }

    // se permiten varias implementaciones de interfaces pero solo 1 extension
    public static class Bird extends Animal implements Flying, Flying2 {

        @Override
        public void sound() {
            System.out.println("grita");
        }

        @Override
        public void sleep() {
            System.out.println("El pajaro esta durmiendo");
        }

        public void fly() {
            System.out.println("El Pajaro vuela");
        }

        @Override
        public void fly2() {
            System.out.println("El Pajaro vuela x2");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("batman");
        }

        @Override
        public void sleep() {
            System.out.println("El murciélago esta durmiendo");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }

}
