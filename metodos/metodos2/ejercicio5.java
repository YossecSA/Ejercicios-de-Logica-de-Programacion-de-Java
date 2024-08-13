package metodos.metodos2;

import java.util.Scanner;

public class ejercicio5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Ingrese su contraseña: ");
            String password = sc.nextLine();

            if (esSegura(password)) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
            } else {
                System.out.println("Contraseña no segura. Debe cumplir con todos los criterios.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
        }
    }

    private static Boolean esSegura(String contrasena) {
        StringBuilder mensajes = new StringBuilder();

        if (!tieneLongitudCorrecta(contrasena)) {
            mensajes.append("Debe tener al menos 8 caracteres. ");
        }

        if (!tieneMayuscula(contrasena)) {
            mensajes.append("Debe tener al menos una letra mayúscula. ");
        }

        if (!tieneMinuscula(contrasena)) {
            mensajes.append("Debe tener al menos una letra minúscula. ");
        }

        if (!tieneNumero(contrasena)) {
            mensajes.append("Debe tener al menos un número. ");
        }

        if (!tieneCaracterEspecial(contrasena)) {
            mensajes.append("Debe tener al menos un carácter especial. ");
        }

        if (mensajes.length() > 0) {
            System.out.println(mensajes.toString());
            return false;
        }

        return true;
    }

    private static boolean tieneLongitudCorrecta(String password) {
        return password.length() >= 8;
    }

    private static boolean tieneMayuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneMinuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneNumero(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tieneCaracterEspecial(String password) {
        String caracteresEspeciales = "!@#$%^&*()-_+=[]{}|;:,.<>?/";
        for (char c : password.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}
