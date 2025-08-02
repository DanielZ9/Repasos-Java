package c05_structures;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        //  Declaracion y creacion
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño
        System.out.println("Tamaño sin agregar: " + names.size());

        // Añadir elementos
        names.put("edad", "25");
        names.put("nick", "DZ");
        names.put("apellido", "Zapata");
        System.out.println("Tamaño despues de agregar: " + names.size());

        // Acceder a los elementos
        System.out.println("edad: " + names.get("edad"));

        // Verificar elementos
        System.out.println("Existe key nombre? " + names.containsKey("nombre"));
        System.out.println("Existe key nick? " + names.containsKey("nick"));

        System.out.println("Existe el valor DZ? " + names.containsValue("DZ"));

        // Eliminar elementos
        System.out.println("Eliminar edad: " + names.remove("edad"));
        System.out.println("map de names: " + names);

        // Limpiar Hasmap
        //.clear();
        //System.out.println("Limpiar map names: " + names);

        // Otras operaciones
        // Modificar -- al no permitir datos repetidos por ser hash se puede cargar con put utilizando la clave y modificando el valor
        names.put("apellido", "Zapata Quiroz");
        System.out.println(names);

        names.replace("apellido", "Zapata"); // Tambien modifica solo is existe la llave
        names.replace("edad", "25");
        System.out.println(names);

        names.putIfAbsent("edad", "25");
        System.out.println(names);

        // visualizar
        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
        


    }

}
