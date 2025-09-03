package c08_oop.accessModifiersExercises;

public class Temperatura {

    private int celsius;

    public Temperatura(int celsius) {
        setCelsius(celsius);
    }

    // Getters

    public int getCelsius() {
        return celsius;
    }

    // Setters

    public void setCelsius(int celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else
            System.out.println("Temperatura " + celsius + " es invalida.");
    }

}
