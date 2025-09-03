package c08_oop.classesExercises;

public class Worker {

    double salario;
    String nombre;

    public Worker(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void showSalary() {
        System.out.println("El salario del trabajador " + nombre + " es: " + salario);
    }

}
