package c08_oop.inheritanceExercises;

public class Rectangle extends Shape {

    private int base;
    private int altura;

    public Rectangle(int base, int altura) {
        setAltura(altura);
        setBase(base);
    }

    @Override
    public void calculateArea() {
        System.out.println("El area del rectángulo es: " + (base * altura));
    }

    // Getters

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    // Setters

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
