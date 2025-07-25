package c01_beginner;

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Variables

        String name = "DZ";
        System.out.println("name: " + name);
        name = "Daniel";

        int age = 25;
        System.out.println(age);
        age = 26;

        var email = "zfernando@gmail.com"; // el atributo var difiere el tipo de varibale que debe asignarse, cambios nuevos en java
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes atributo "final"

        final String EMAIL = "zdaniel@gmail.com"; //por lo general en mayusculas
        System.out.println(EMAIL);


    }

}
