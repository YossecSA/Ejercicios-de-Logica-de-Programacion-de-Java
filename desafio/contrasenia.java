package desafio;

import java.util.Scanner;

public class contrasenia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Escribe un programa que solicite al usuario que ingrese una contraseña y
        // verifique si cumple con los siguientes criterios para considerarse segura:

        // La contraseña debe tener al menos 8 caracteres.

        // La contraseña debe contener al menos una letra mayúscula y una letra
        // minúscula.

        // La contraseña debe contener al menos un número.

        // La contraseña debe contener al menos un carácter especial (por ejemplo, !, @,
        // #, $).

        // El programa debe mostrar un mensaje indicando si la contraseña es segura o
        // no, según los criterios establecidos. Puedes utilizar métodos de la clase
        // String para verificar cada uno de los criterios.

        try {
            System.out.print("Ingrese su contraseña: ");
            String password = sc.nextLine();

            String resultado = ContrasenaSegura(password);

            if (resultado.equals("SEG-CONT")) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
            } else {
                System.out.println("Contraseña no segura. " + resultado);
            }

        } catch (Exception e) {
            System.out.println("error: " + e);
        } finally {
            sc.close();
        }
    }

    private static String ContrasenaSegura(String contrasena) {

        String mensajes = "";

        if (contrasena.length() < 8) {
            mensajes = "Debe tener al menos 8 caracteres. ";
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (char c : contrasena.toCharArray()) { //h,o,l,a
            
            if (validacionMayuscula(c)) {
                tieneMayuscula = true;

            } else if (validacionMinuscula(c)) {
                tieneMinuscula = true;

            } else if (validacionNumero(c)) {
                tieneNumero = true;

            } else if (validacionCaracterEspecial(c)) {
                tieneCaracterEspecial = true;
            }
        }

        if (!tieneMayuscula) {
            mensajes += "Debe tener al menos una letra mayúscula. ";
        }
        if (!tieneMinuscula) {
            mensajes += "Debe tener al menos una letra minúscula. ";
        }
        if (!tieneNumero) {
            mensajes += "Debe tener al menos un número. ";
        }
        if (!tieneCaracterEspecial) {
            mensajes += "Debe tener al menos un carácter especial. ";
        }

        if (mensajes.length() == 0) {
            return "SEG-CONT";
        } else {
            return mensajes;
        }
    }

    private static boolean validacionMayuscula(char letra) {
        return Character.isUpperCase(letra);
    }

    private static boolean validacionMinuscula(char letra) {
        return Character.isLowerCase(letra);
    }

    private static boolean validacionNumero(char letra) {
        return Character.isDigit(letra);
    }

    private static boolean validacionCaracterEspecial(char letra) {

        String caracteresEspeciales = "!@#$%^&*()-_+=[]{}|;:,.<>?/";
        return caracteresEspeciales.indexOf(letra) >= 0;
    }

}
