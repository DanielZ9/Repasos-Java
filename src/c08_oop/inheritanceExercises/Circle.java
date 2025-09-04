package c08_oop.inheritanceExercises;

public class Circle extends Shape {

    private double radio;
    private double pi = 3.14;

    public Circle(double radio) {
        setRadio(radio);
    }

    @Override
    public void calculateArea() {
        System.out.println("El area del circulo es: " + ((Math.pow(radio, 2)) * pi));
    }

    // Getters

    public double getRadio() {
        return radio;
    }

    // Setters

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
