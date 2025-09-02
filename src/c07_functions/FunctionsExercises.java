package c07_functions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {
        printMessage();
        saludarPersona("Daniel");
        System.out.println("Resta de 5 y 3: " + restaNum(5, 3));
        cuadradoNum(4);
        parImpar(4);
        System.out.println("Validar edad 25: " + validarEdad(25));
        System.out.println("la longitud de Daniel es: " + longitudCadena("Daniel"));
        int[] numbers = {5, 4, 3, 2};
        System.out.println("Media de numbers: " + mediaDelArray(numbers));
        System.out.println("El factorial de 5 es: " + factorial(5));
        var nombres = new ArrayList<String>();
        nombres.add("Daniel");
        nombres.add("Fernando");
        nombres.add("Zapata");
        nombres.add("Quiroz");
        recorrerArrayList(nombres);

    }

    public static void printMessage() {
        System.out.println("¡Te doy la bienvenida al curso de java!");
    }

    public static void saludarPersona(String name) {
        System.out.println("Hola " + name);
    }

    public static int restaNum(int a, int b) {
        return (a - b);
    }

    public static void cuadradoNum(int a) {
        System.out.println("el cuadrado de: " + a + " es :" + (a * a));
    }

    public static void parImpar(int a) {
        if ((a % 2) == 0) {
            System.out.println("El numero " + a + " es par");
        } else
            System.out.println("El numero " + a + " es impar");
    }

    public static boolean validarEdad(int edad) {
        return (edad >= 18);
    }

    public static int longitudCadena(String cadena) {
        return (cadena.length());
    }

    public static double mediaDelArray(int[] numbers) {
        int suma = 0;
        for (int number : numbers) {
            suma += number;
        }
        return ((double) suma / numbers.length);
    }

    public static int factorial(int number) {
        int factorial = 1;
        int variant = number;
        for (int i = 0; i < (number - 1); i++) {
            factorial *= variant;
            variant -= 1;
        }
        return factorial;
    }

    public static void recorrerArrayList(ArrayList<String> elementos) {
        for (String element : elementos) {
            System.out.println(element);
        }
    }

}
