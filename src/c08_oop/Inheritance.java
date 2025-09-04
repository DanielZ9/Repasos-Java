package c08_oop;

public class Inheritance {

    public static void main(String[] args) {
        // Herencia

        var animal = new Animal("Primer Animal");
        animal.eat();

        var mafalda = new Dog("Mafalda", 4);
        mafalda.eat();

        var melcocha = new Cat("Melcocha");
        melcocha.eat();

        var gritona = new Bird("Gritona");
        gritona.eat();
        gritona.fly();


    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal " + name + " esta comiendo");
        }

    }

    public static class Dog extends Animal {

        int patas;

        public Dog(String name, int patas) {
            super(name);
            this.patas = patas;
        }

        @Override
        public void eat() {
            System.out.println("El Perro " + name + " está comiendo");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("El pajaro está volando");
        }

    }

}
