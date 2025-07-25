package c02_operators;

public class Operators {

    public static void main(String[] args) {

        // Operadores

        // Aritmeticos
        System.out.println("Aritmeticos ----------------");

        var a = 5;
        var b = 3;
        System.out.println("a: " + a + " y b: " + b);
        System.out.println("suma de a y b: " + (a + b));
        System.out.println("resta de a y b: " + (a - b));
        System.out.println("multiplicacion de a y b: " + (a * b));
        System.out.println("division de a y b: " + (a / b));
        System.out.println("modulo de a y b: " + (a % b));

        // Asignacion
        System.out.println("Asignacion -----------------");

        a = 10;
        System.out.println("a: " + a);

        a = b * 2;
        System.out.println("a = b * 2 => a = " + a);

        a += 1;
        System.out.println("a +=1 => a = " + a);

        a -= 2;
        System.out.println("a -= 2 => a = " + a);

        a *= 2;
        System.out.println("a *= 2 => a = " + a);

        a /= 2;
        System.out.println("a /= 2 => a = " + a);

        a %= 2;
        System.out.println("a %= 2 => a = " + a);

        // Comparacion (Relacionesles)
        System.out.println("Comparacion Relacionesles) --");

        System.out.println("a == b: " + (a == b));
        System.out.println("a == 6: " + (a == 6));
        System.out.println("a == 1: " + (a == 1));

        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));

        // Logicos
        System.out.println("Logicos ---------------------");

        // Y (AND)
        System.out.println("Tabla de verdad para AND / &&");
        System.out.println("True && True: " + (true && true));
        System.out.println("True && False: " + (true && false));
        System.out.println("False && True: " + (false && true));
        System.out.println("False && False: " + (false && false));

        // O (OR)
        System.out.println("Tabla de verdad para OR / ||");
        System.out.println("True || True: " + (true || true));
        System.out.println("True || False: " + (true || false));
        System.out.println("False || True: " + (false || true));
        System.out.println("False || False: " + (false || false));

        // NO (NOT)
        System.out.println("Tabla de verdad para NOT / !");
        System.out.println("!True: " + (!true));
        System.out.println("!False: " + (!false));

        // Unarios
        System.out.println("Unarios + - ++ --");
        System.out.println("b:" + b);
        System.out.println("+b: " + (+b));
        System.out.println("-b: " + (-b));
        System.out.println("++b: " + (++b));
        System.out.println("b++: " + (b++));
        System.out.println("b: " + (b));
        System.out.println("--b: " + (--b));
        System.out.println("b--: " + (b--));
        System.out.println("b: " + (b));


    }

}
