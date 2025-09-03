package c08_oop.classesExercises;

public class Rectangle {

    int base;
    int altura;

    public Rectangle(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    public void area() {
        var area = base * altura;
        System.out.println("El area del rectángulo es: " + area);
    }

    public void perimetro() {
        var perimetro = ((base * 2) + (altura * 2));
        System.out.println("El perimetro del rectángulo es: " + perimetro);
    }

}
