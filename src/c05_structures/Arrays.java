package c05_structures;

public class Arrays {

    public static void main(String[] args) {

        // Declaracion y creacion
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"DZ", "Diego", "Sirley", "Luisa", "Miguel"};
        System.out.println(names);

        // Acceso
        System.out.println(names[0]);
        System.out.println(numbers[0]);

        System.out.println((new String[3])[0]);

        // Modificacion
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println(names[2]);
        names[2] = "Shirly";
        System.out.println(names[2]);

        names[2] = null;
        System.out.println(names[2]);


    }

}
