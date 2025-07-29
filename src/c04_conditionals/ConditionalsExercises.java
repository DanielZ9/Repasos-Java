package c04_conditionals;

public class ConditionalsExercises {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        var edad = 19;

        if (edad == 18) {
            System.out.println("Puede votar, y se entrega cetificado de primera votacion");
        } else if (edad > 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("Menor de edad, no puede votar");
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        var a = 5;
        var b = 6;

        if (a == b) {
            System.out.println("Son iguales");
        } else if (a > b) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("b es mayor que a");
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        var c = 5;

        if (c > 0) {
            System.out.println("c es positivo");
        } else if (c < 0) {
            System.out.println("c es negativo");
        } else {
            System.out.println("c es 0");
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        if ((c % 2) == 0) {
            System.out.println("c es par");
        } else
            System.out.println("c es impar");

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        if ((c >= 1) && (c <= 100)) {
            System.out.println("c esta en el rango de 1 y 100");
        } else
            System.out.println("c fuera de rango");

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        var dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        var nota = 50;

        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else
            System.out.println("Suspenso");

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        var edadCine = 14;
        var acudiente = true;

        if ((edadCine >= 15) || (acudiente == true)) {
            System.out.println("Puede entrar al cine");
        } else
            System.out.println("No puede entrar al cine");

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        var l = "o";

        switch (l) {
            case "a":
                System.out.println("Vocal");
                break;
            case "e":
                System.out.println("Vocal");
                break;
            case "i":
                System.out.println("Vocal");
                break;
            case "o":
                System.out.println("Vocal");
                break;
            case "u":
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonante");
        }

        System.out.println("-------------------------------------------------------------");
        // ---------------------------------------------------------------------------------

        System.out.println(" a: " + a + " b: " + b + " c: " + c);
        if (a > b) {
            if (a > c) {
                System.out.println("a es mayor");
            } else
                System.out.println("c es mayor");
        } else if (b > c) {
            System.out.println("b es mayor");
        } else
            System.out.println("c es mayor");

    }

}
