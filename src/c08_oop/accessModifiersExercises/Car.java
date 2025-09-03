package c08_oop.accessModifiersExercises;

public class Car {

    private int speed;

    public Car(int speed) {
        setSpeed(speed);
    }

    public void acelerate(int aumento) {
        if ((speed + aumento) <= 120) {
            speed += aumento;
            System.out.println("Nueva velocidad: " + speed);
        } else
            System.out.println("La aceleración " + aumento + ", excede el limite");
    }

    public void brake(int amount) {
        if ((speed - amount) >= 0) {
            speed -= amount;
            System.out.println("Nueva velocidad: " + speed);
        } else
            System.out.println("La reducción " + amount + ", excede el limite");
    }

    // Getters

    public int getSpeed() {
        return speed;
    }

    // Setters

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


