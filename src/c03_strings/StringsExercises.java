package c03_strings;

public class StringsExercises {

    public static void main(String[] args) {

        var name = "Daniel";
        System.out.println("------------------------------------------------");
        System.out.println("cadena 1 + " + "cadena 2");

        System.out.println("------------------------------------------------");
        System.out.println("longitud de Daniel: " + (name.length()));

        System.out.println("------------------------------------------------");
        System.out.println("primer y ultimo caracter de Daniel: " + (name.charAt(0)) + " Y " +
                (name.charAt(name.length() - 1)));

        System.out.println("------------------------------------------------");
        System.out.println("Daniel todo en MAYUSCULAS: " + name.toUpperCase());
        System.out.println("Daniel todo en minusculas: " + name.toLowerCase());

        System.out.println("------------------------------------------------");
        System.out.println("Daniel contiene ie? " + name.contains("ie"));

        System.out.println("------------------------------------------------");
        System.out.println(String.format("Daniel tiene %d", 25));

        System.out.println("------------------------------------------------");
        var textParaTrim = " Hola con espacios en inicio y fin ";
        System.out.println(textParaTrim);
        System.out.println("Ahora sin espacios utilizando Trim");
        System.out.println(textParaTrim.trim());

        System.out.println("------------------------------------------------");
        var textConEspacios = "Hola este texto tiene espacios ";
        System.out.println(textConEspacios);
        System.out.println("remover los espacios por |");
        System.out.println(textConEspacios.replace(" ", "|"));

        System.out.println("------------------------------------------------");
        var a = "azul";
        var b = "rojo";
        System.out.println("a: " + a + " y b: " + b);
        System.out.println("a.equals(b): " + (a.equals(b)));

        System.out.println("------------------------------------------------");
        System.out.println("a y b tienen la misma longitud ? " + ((a.length()) == (b.length())));

    }

}
