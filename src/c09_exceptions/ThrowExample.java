package c09_exceptions;

public class ThrowExample {

    public static void main(String[] args) {
        var age = 15;
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
            //System.out.println("No puede ser menor de edad");
        }
    }

    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("Puntuación invalida, debe estar entre 0 y 100");
        } else {
            System.out.println("Puntuación válida: " + score);
        }
    }

}
