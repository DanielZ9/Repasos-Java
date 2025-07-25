package c01_beginner;

public class BeginnerExercises {

    public static void main(String[] args) {

        String name = "DZ";
        int edad = 25;
        double altura = 1.70;
        boolean gustoPorProgramar = true;
        final String email = "zd@gmail.com";
        char inicial = 'D';
        String direccion = "calle 1";
        direccion = "calle 2";
        int a = 5;
        int b = 7;
        System.out.println(a + b);
        System.out.println("tipo para name: " + name.getClass().getSimpleName() + " y tipo para inicial: " + ((Object) inicial).getClass().getSimpleName());
        String dia;
        dia = "jueves";
        System.out.println("dia: " + dia);

    }

}
