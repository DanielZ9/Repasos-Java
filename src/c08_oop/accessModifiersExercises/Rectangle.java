package c08_oop.accessModifiersExercises;

public class Rectangle {

    private int base;
    private int altura;

    public Rectangle(int base, int altura) {
        setBase(base);
        setAltura(altura);
    }

    public void calculateArea() {
        System.out.println("El area del rectangulos es: " + (base * altura));
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
