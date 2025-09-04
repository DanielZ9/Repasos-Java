package c08_oop.abstractionExercises;

import c08_oop.inheritanceExercises.Truck;

public class AbstractionExercises {
    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        var circulo = new Circle(3);
        circulo.calculateArea();
        var rectangulo = new Rectangle(2, 5);
        rectangulo.calculateArea();

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        var guitarra = new guitar();
        guitarra.play();
        var piano = new Piano();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        var mafalda = new Dog();
        //mafalda.makeSound();
        var melcocha = new Cat();
        //melcocha.makeSound();
        Animal[] animales = new Animal[2];
        animales[0] = mafalda;
        animales[1] = melcocha;
        for (Animal animal : animales) {
            System.out.println("Bucle con animales: " + animal);
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        var triangulo = new Triangle();
        triangulo.draw();
        //circulo.draw();
        //rectangulo.draw();

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.

        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
    }
}
