package desafio;

import java.util.Scanner;

public class contrasenia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese una contraseña: ");
            String contrasena = sc.nextLine();

            String mensajes = "";

            if (contrasena.length() < 8) {
                mensajes += "* Debe tener al menos 8 caracteres.\n ";
            }

            if (!contrasena.matches(".*[A-Z].*")) {
                mensajes += "* Debe tener al menos una letra mayúscula.\n ";
            }

            if (!contrasena.matches(".*[a-z].*")) {
                mensajes += "* Debe tener al menos una letra minúscula.\n ";
            }

            if (!contrasena.matches(".*\\d.*")) {
                mensajes += "* Debe tener al menos un número.\n ";
            }

            if (!contrasena.matches(".*[!@#$%^&*()\\-_=+\\[{\\]}|;:',<.>/?].*")) {
                mensajes += "* Debe tener al menos un carácter especial. ";
            }

            if(mensajes.length() > 0){
                System.out.println("Contraseña no segura.\n " + mensajes);
            }else{
                System.out.println("¡Contraseña segura! Cumple con todos los criterios. ");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e);
        } finally {
            sc.close();
        }
    }
}
