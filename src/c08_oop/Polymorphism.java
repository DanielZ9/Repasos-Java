package c08_oop;

public class Polymorphism {

    public static void main(String[] args) {

        // Polimorfismo

        // - Por herencia (Sobrescritura)

        var animal = new Animal();
        animal.sound();

        var perro = new Dog();
        perro.sound();

        // - Por sobrecarga (sobrecarga de métodos)

        var calculadora = new Calculadora();
        System.out.println(calculadora.sum(4.3, 3.4));
        System.out.println(calculadora.sum(3, 4));
        System.out.println(calculadora.sum(1, 2, 3));

    }

    // - Por herencia (Sobrescritura)

    public static class Animal {

        public void sound() {
            System.out.println("Algún sonido");
        }

    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }

    // - Por sobrecarga (sobrecarga de métodos)

    public static class Calculadora {

        public int sum(int a, int b) {
            return (a + b);
        }

        public int sum(int a, int b, int c) {
            return (a + b + c);
        }

        public double sum(double a, double b) {
            return (a + b);
        }

    }

}
