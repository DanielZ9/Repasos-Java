package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main(String[] args) {

        // Loops

        // for

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " DZ");
        }

        String[] names = {"Daniel", "Luisa", "Miguel"};
        System.out.println("----- bucle for ------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // for-each
        System.out.println("----- bucle foreach ------");
        for (String name : names) {
            System.out.println(name);
        }

        var numbers = new HashSet<String>();
        numbers.add("1009");
        numbers.add("1605");
        numbers.add("0710");

        System.out.println("----- bucle foreach con hashSet ------");
        for (String number : numbers) {
            System.out.println(number);
        }

        var emails = new HashMap<String, String>();
        emails.put("DZ", "dz@gmail.com");
        emails.put("LZ", "lz@gmail.com");
        emails.put("MZ", "mz@gmail.com");

        System.out.println("----- bucle foreach con hashMap ------");
        System.out.println("______________");
        for (Map.Entry<String, String> email : emails.entrySet()) {
            System.out.println(email);
            System.out.println(email.getKey());
            System.out.println(email.getValue());
            System.out.println("______________");
        }

        // while

        System.out.println("----- bucle while ------");
        var index = 0;
        while (index < 5) {
            System.out.println("DZ");
            index++;
        }
        System.out.println("______________");

        index = 0;
        var find = false;
        while ((index < 5) && find == false) {
            if (index == 2) {
                System.out.println("deberia romperse en el proximo FQ");
                find = true;
            }
            System.out.println("FQ");
            index++;
        }
        System.out.println("______________");
        System.out.println("----- bucle do-while ------");
        index = 0;
        do {
            System.out.println("Hola DZ!");
            index++;
        } while (index < 0);
        System.out.println("______________");

        // Control de bucles
        System.out.println("______________");
        System.out.println("----- control de bucles ------");

        // Break
        System.out.println("----- Break ------");
        index = 0;
        while ((index < 5)) {
            if (index == 3) {
                System.out.println("deberia romperse aquí");
                break;
            }
            System.out.println("FQ");
            index++;
        }

        // Continue --- se salta a la siguiente ejecucion
        System.out.println("----- continue ------");
        index = 0;
        while ((index < 5)) {
            index++;
            if (index == 3) {
                System.out.println(index + ": no lo muestra porque continua");
                continue;
            }
            System.out.println(index);
        }
        System.out.println("______________");
        index = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                System.out.println(+i + ": no lo muestra porque continua");
                continue;
            }
            System.out.println("i: " + i);
        }


    }

}
