package c08_oop;

public class Composition {

    public static void main(String[] args) {

        // Composición

        var car = new Car();
        car.motor.on();

    }

    public static class Engine {

        public void on() {
            System.out.println("Motor encendido");
        }

    }

    public static class Car {

        private final Engine motor = new Engine();

        public void on() {
            motor.on();
        }

    }

}
