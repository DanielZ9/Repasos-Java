package c05_structures;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        // Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño
        System.out.println("Tamaño: " + names.size());

        // Añadir elementos
        names.add("DZ");
        names.add("Diego");
        names.add("Sirley");
        System.out.println("Tamaño names: " + names.size());

        // Eliminar elementos
        names.add("Prueba");
        System.out.println(names);
        names.remove("prueba");
        System.out.println(names);

        // Buscar elementos
        System.out.println("Contiene DZ: " + names.contains("DZ"));
        System.out.println("Contiene Diego: " + names.contains("Diego"));

        // No permite repetidos
        names.add("DZ");
        names.add("DZ");
        names.add("DZ");
        names.add("DZ");
        System.out.println(names);


        // Conjuntos
        // names.addAll(numbers); Error de tipos
        var countries = new HashSet<String>();
        countries.add("Colombia");
        countries.add("Ecuador");
        countries.add("DZ");

        names.addAll(countries);
        System.out.println("names + countries: " + names);

        //names.removeAll(countries);
        //System.out.println("se elimina el conjunto countries: " + names);

        names.retainAll(countries);
        System.out.println(names);


    }

}
