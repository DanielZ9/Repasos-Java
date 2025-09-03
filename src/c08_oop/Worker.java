package c08_oop;

import javax.xml.namespace.QName;

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
