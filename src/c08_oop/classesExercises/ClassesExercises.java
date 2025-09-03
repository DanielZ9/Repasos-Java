package c08_oop.classesExercises;

import java.util.Arrays;

public class ClassesExercises {

    public static void main(String[] args) {

        var libro = new Book("La María", "Jorge Isaacs");
        libro.showData();

        var perro = new Dog();
        perro.bark();

        var carro = new Car("Mazda", "2025");
        carro.showData();

        var student = new Student(65);
        student.showApproval();
        var student2 = new Student(55);
        student2.showApproval();

        var banco = new BankAccount(150000);
        System.out.println("Su balance es: " + banco.balance);
        banco.deposito(75000);

        var rectangulo = new Rectangle(5, 14);
        rectangulo.area();
        rectangulo.perimetro();

        var worker = new Worker("Daniel", 627000);
        worker.showSalary();

        var person1 = new Person("Daniel", 25, "1");
        var person2 = new Person("Diego", 45, "2");
        var person3 = new Person("Sirley", 46, "3");
        var persons = Arrays.asList(person1, person2, person3);
        System.out.println(persons);
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        var product = new Product("Arroz", 3000);
        product.descuento(500);

    }

}
