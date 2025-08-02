package c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LoopsExercises {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var index = 1;
        while (index <= 10) {
            System.out.println(index);
            index++;
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var names = new ArrayList<String>();
        names.add("Sirley");
        names.add("Diego");
        names.add("Daniel");
        names.add("Luisa");
        names.add("Miguel");

        index = 0;
        do {
            System.out.println(names.get(index));
            index++;
        } while (index < names.size());

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        for (int i = 1; i <= 50; i++) {
            if ((i % 5) == 0) {
                System.out.println(i + ": es multiplo de 5");
            }
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        int[] numbers = {5, 10, 15, 20, 25};
        var sumatoria = 0;
        for (int number : numbers) {
            sumatoria += number;
        }
        System.out.println("La suma de los 5 numeros en el array es: " + sumatoria);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        for (var number : numbers) {
            System.out.println(number);
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var numbersHashSet = new HashSet<Integer>();
        numbersHashSet.add(1232);
        numbersHashSet.add(9309);
        numbersHashSet.add(1911);
        for (int number : numbersHashSet) {
            System.out.println(number);
        }
        System.out.println("------------------------------");
        var numbersHashMap = new HashMap<Integer, Integer>();
        numbersHashMap.put(1, 1234);
        numbersHashMap.put(2, 4321);
        numbersHashMap.put(3, 1911);
        for (var number : numbersHashMap.values()) {
            System.out.println(number);
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        for (var i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        for (var i = 1; i <= 20; i++) {
            if ((i % 3) == 0) {
                continue;
            }
            System.out.println("numeros del 1 al 20 saltando multiplos de 3: " + i);
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        int[] searchNegative = {2, 5, 7, -8, 4, 2, -9, 18};
        for (int number : searchNegative) {
            if (number < 0) {
                System.out.println("negativo encontrado: " + number);
                break;
            }
            System.out.println("Buscando el negativo: " + number);
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var numFactorial = 5;
        var factorial = 1;
        for (var i = numFactorial; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de: " + numFactorial + " es: " + factorial);

    }


}
