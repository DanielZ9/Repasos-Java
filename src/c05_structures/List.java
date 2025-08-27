package c05_structures;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class List {

    public static void main(String[] args) {

        // Declaracion y creacion
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();
        var numbers2 = Arrays.asList("123", "321");

        // Tamaño
        System.out.println("Tamaño names: " + names.size());

        // Añadir elementos
        names.add("DZ");
        names.add("Diego");
        names.add("Sirley");
        System.out.println("Tamaño names: " + names.size());

        // Acceder a los elementos
        System.out.println("posicion 1: " + names.get(1));
        System.out.println("Primera posicion: " + names.getFirst());
        System.out.println("Ultima posicion: " + names.getLast());

        // Modificar los elementos
        names.set(0, "DZ-Daniel");
        System.out.println("Primera posicion: " + names.getFirst());

        // Eliminar elementos
        names.add("Prueba");
        System.out.println(names.get(3));
        names.remove(3);
        //System.out.println(names.get(3)); error

        // Buscar elementos
        System.out.println("Contiene DZ: " + names.contains("DZ"));
        System.out.println("Contiene Diego: " + names.contains("Diego"));

        // Limpiar ArrayList
        names.clear();
        System.out.println("Tamaño despues de usar names.clear: " + names.size());


    }

}
