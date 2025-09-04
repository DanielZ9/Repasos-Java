package c08_oop.inheritanceExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class InheritanceExercises {

    public static void main(String[] args) {
        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var car = new Car();
        car.honk();
        car.move();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        var daniel = new Studen("Daniel", 25, 11);
        daniel.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var mafalda = new Dog();
        mafalda.makeSound();
        var pantera = new Cat();
        pantera.makeSound();
        var gritona = new Bird();
        gritona.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        var manager = new Manager("Daniel", 150000, "Sistemas");
        System.out.println(manager.getDepartment());

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        var circulo = new Circle(5);
        circulo.calculateArea();
        var rectangulo = new Rectangle(5, 10);
        rectangulo.calculateArea();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var ave = new Eagle();
        ave.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var phone = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        var cuenta = new SavingsAccount(50000, 1);
        cuenta.addInterest();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        car.describe();
        var truck = new Truck();
        truck.describe();
        var bike = new Bike();
        bike.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        ArrayList<Animal> animalsList = new ArrayList<>();
        //var animales = new ArrayList<Animal>();
        animalsList.add(mafalda);
        animalsList.add(pantera);
        animalsList.add(gritona);
        for (Animal animal : animalsList) {
            animal.makeSound();
        }

    }

}
