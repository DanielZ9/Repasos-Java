package c02_operators;

public class OperatorsExercises {

    public static void main(String[] args) {

        var resultadoSuma = 5 + 8;
        System.out.println("Resultado Suma 5 + 8 = " + resultadoSuma);

        var resultadoResta = 5 - 8;
        System.out.println("Resultado Resta 5 - 8 = " + resultadoResta);

        var resultadoMultiplicacion = 5 * 8;
        System.out.println("Resultado Multiplicacion 5 * 8 = " + resultadoMultiplicacion);

        var resultadoDivision = 5 / 8;
        System.out.println("Resultado Division 5 / 8 = " + resultadoDivision);

        var resultadoModulo = 5 % 8;
        System.out.println("Resultado Modulo 5 % 8 = " + resultadoModulo);

        var z = 1;
        System.out.println("z = " + z);
        z = 4;
        System.out.println("z = 4 => " + z);

        var a = 1;
        System.out.println("a = " + a);
        a += 1;
        System.out.println("a += 1 => " + a);

        var b = 1;
        System.out.println("b = " + b);
        b -= 1;
        System.out.println("b -= 1 => " + b);

        var c = 1;
        System.out.println("c = " + c);
        c *= 3;
        System.out.println("c *= 3 => " + c);

        var d = 1;
        System.out.println("d = " + d);
        d /= 2;
        System.out.println("d /= 2 => " + d);

        var e = 5;
        System.out.println("e = " + e);
        e %= 2;
        System.out.println("e /%= 2 => " + e);

        System.out.println("2 == 2: " + (2 == 2));
        System.out.println("2 < 4: " + (2 < 4));
        System.out.println("4 > 1: " + (4 > 1));
        System.out.println("2 != 2: " + (2 != 2));
        System.out.println("2 == 4: " + (2 == 4));
        System.out.println("5 < 3: " + (5 < 3));

        System.out.println("5 == 4 && 3 > 2: " + (5 == 4 && 3 > 2));
        System.out.println("5 == 5 && 7 > 5: " + (5 == 5 && 7 > 5));

        System.out.println("5 == 4 || 3 > 2: " + (5 == 4 || 3 > 2));
        System.out.println("5 == 9 || 7 < 5: " + (5 == 9 || 7 < 5));

        System.out.println("(5 == 5 && 7 > 5) && (5 == 4 || 3 > 2): " + ((5 == 5 && 7 > 5) && (5 == 4 || 3 > 2)));

        System.out.println("(5 == 5 && 7 > 5) || (5 == 4 && 3 > 2): " + ((5 == 5 && 7 > 5) || (5 == 4 && 3 > 2)));

        System.out.println("negacion de !true: " + (!true));

        System.out.println("z: " + z);
        System.out.println("z++: " + z++);
        System.out.println("z: " + z);
        System.out.println("++z: " + ++z);
        System.out.println("z: " + z);
        System.out.println("--z: " + --z);
        System.out.println("z: " + z);

        System.out.println("((5+3) == 8) && (5 >= (15/3)): " + (((5 + 3) == 8) && (5 >= (15 / 3))));


    }

}
