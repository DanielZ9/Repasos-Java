package c07_functions;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        System.out.println("main");

        sendEmail();
        sendEmailToUser("dz@dz.com");
        sendEmailToUser("dz@dz.com", "Daniel");

        String[] emails = {"dz@dz.com", "fq@fq.com"};
        sendEmailToUser(emails);

        System.out.println(confirmSendEmail());
        //System.out.println(sendEmailWithState("dq@dq.com"));
        System.out.println(sendEmailWithState(""));

    }

    // Funcion sin parametros
    public static void sendEmail() {

        System.out.println("-----------------------------");
        System.out.println("sendEmail");

    }

    // Funcion con parametros
    public static void sendEmailToUser(String email) {

        System.out.println("-----------------------------");
        System.out.println("sendEmailToUser con parametro");
        System.out.println("Se envia el email a: " + email);

    }

    public static void sendEmailToUser(String email, String user) {

        System.out.println("-----------------------------");
        System.out.println("sendEmailToUser multiple parametro");
        System.out.println("Se envia el email a: " + email + " del usuario: " + user);

    }

    public static void sendEmailToUser(String[] emails) {

        System.out.println("-----------------------------");
        System.out.println("bucle de emails");
        for (String email : emails) {
            sendEmailToUser(email);
        }

    }

    // Funcion con retorno
    public static boolean confirmSendEmail() {

        System.out.println("-----------------------------");
        System.out.println("confirmSendEmail");
        return true;

    }

    public static boolean sendEmailWithState(String email) {

        System.out.println("-----------------------------");
        if (email.isEmpty()) {

            System.out.println("No adjunto email");
            return false;
        }
        System.out.println("Se envio el email a :" + email);
        return true;
    }

}
