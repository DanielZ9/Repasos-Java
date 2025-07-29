package c03_strings;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        // Declaracion
        String name = "DZ";
        name = "Daniel";
        var surname = new String("Zapata");

        // Operaciones basicas
        System.out.println(name + " " + surname);

        System.out.println("tamaño del nombre: " + name.length());

        //Obtener caracter
        System.out.println("obtener un caracter: " + name.charAt(name.length() - 1));

        // Subcadena
        System.out.println("Subcadena de la posicion 2 en adelante: " + name.substring(2));
        System.out.println("Subcadena entre 0 y 3: " + name.substring(0, 3));

        // Mayusculas y minusculas
        System.out.println("Todo mayusculas: " + name.toUpperCase());
        System.out.println("Todo minusculas: " + name.toLowerCase());
        System.out.println("Original: " + name);

        // Comprobar si contiene
        System.out.println("Hola DZ!! contains DZ?" + ("Hola DZ!! ".toUpperCase().contains("DZ")));

        // Comparacion
        System.out.println("compara si name equals Daniel: " + (name.equals("Daniel")));
        System.out.println("compara si name equals daniel: " + (name.equals("daniel")));
        System.out.println("compara si name equals daniel ignorando el mayusculas/minusculas con case: " +
                (name.equalsIgnoreCase("daniel")));

        // == vs .equals
        System.out.println("== vs equals");
        var a = "Daniel";
        var b = "Daniel";
        var c = new String("Daniel");

        System.out.println("a: Daniel == b: Daniel :" + (a == b));
        System.out.println("a: Daniel == c: Daniel :" + (a == c));
        System.out.println("a.equals(c) :" + (a.equals(b)));

        // Trim
        System.out.println("Trim para limpiar espacios: " + (" DZ ".trim()));

        // Replace
        System.out.println("Reemplazar DZ por Daniel en 'Hola DZ!!': " + ("Hola DZ!!".replace("DZ", "Daniel")));

        // Format
        var nextAge = 26;
        var textoFormateado = String.format("Hola %s, en septiempre cumples %d", name, nextAge);
        System.out.println("Formatear variables en textos utilizando format y %: " + textoFormateado);

    }

}
