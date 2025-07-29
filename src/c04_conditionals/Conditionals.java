package c04_conditionals;

public class Conditionals {

    public static void main(String[] args) {

        //Condicionales

        // if - else

        var age = 18;
        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario tiene 18 años");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        // switch

        var day = 5;

        switch(day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Cualquier otro dia");
        }

    }

}
