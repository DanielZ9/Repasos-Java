package c01_beginner;

public class DataTypes {

    public static void main(String[] args) {

        // Tipos de datos primitivos

        int enteros = 25;
        System.out.println("entero: " + enteros);

        double decimal = 1.70;
        System.out.println("decimal: " + decimal);

        char caracter = 'a';
        System.out.println("un caracter: " + caracter);

        boolean booleano = true;
        System.out.println("booleano: " + booleano);

        // float, long byte . . .

        String cadenaDeTexto = "Hola DZ!!"; // String no es primitivo, es una clase, pero una cadena si esta dentro de los datos primitivos
        System.out.println("cadena de texto: " + cadenaDeTexto);

        // Tipo de dato en tiempo de compilacion
        // Por lo general los datos primitivos tienen su tipo de dato en clase

        System.out.println(cadenaDeTexto.getClass().getSimpleName());

    }

}
