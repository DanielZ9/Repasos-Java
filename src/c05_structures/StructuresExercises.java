package c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StructuresExercises {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var array1 = new int[5];
        array1[0] = 46;
        array1[1] = 45;
        array1[2] = 25;
        array1[3] = 22;
        array1[4] = 18;
        System.out.println("Longitud array1: " + array1.length);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        System.out.println("array1[0] antes: " + array1[0]);
        array1[0] = 47;
        System.out.println("array1[0] despues: " + array1[0]);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var names = new ArrayList<String>();
        names.add("Daniel");
        names.add("Luisa");
        names.add("Miguel");
        names.add("Eliminar");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var contacts = new HashSet<Integer>();
        contacts.add(300);
        contacts.add(205);
        System.out.println(contacts);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        contacts.add(300);
        contacts.add(930);
        System.out.println(contacts);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        contacts.remove(205);
        System.out.println(contacts);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var libreta = new HashMap<String, Integer>();
        libreta.put("Daniel", 30075);
        libreta.put("Diego", 32264);
        libreta.put("Luisa", 31654);
        System.out.println(libreta);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        libreta.replace("Daniel", 31481);
        libreta.remove("Luisa");
        System.out.println(libreta);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------
        var array2 = new String[5];
        array2[0] = "Daniel";
        array2[1] = "Luisa";
        array2[2] = "Miguel";
        array2[3] = "Diego";
        array2[4] = "Sirley";
        System.out.println(array2);
        var lista1 = Arrays.asList(array2);
        System.out.println(lista1);
        var hashset1 = new HashSet<>(lista1);
        System.out.println(hashset1);
        HashMap<String, String> hashmap1 = hashset1.stream().collect(Collectors.toMap(Function.identity(), Function.identity(),
                (v1, v2) -> v1, HashMap::new));
        System.out.println(hashmap1);

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

    }

}
