package c09_exceptions;

public class Exceptions {

    public static void main(String[] args) {

        // Manejo de excepciones

        // try catch
        try {
            var result = 10 / 2;
            System.out.println(result);

//        } catch (Exception e) {
        } catch (ArithmeticException e) {
//        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }

        // try con multiples catch
        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Daniel";
            name = null;
            System.out.println("Name: " + name.toUpperCase());

        } catch (ArithmeticException e) {
            System.out.println("Error division por cero: " + e);
        } catch (NullPointerException e) {
            System.out.println("Error null en texto: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        // throw

        var throwExample = new ThrowExample();

        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Exepción personalizada

        try {
            throwExample.checkScore(-5);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }


        System.out.println("Fin");

    }

}
