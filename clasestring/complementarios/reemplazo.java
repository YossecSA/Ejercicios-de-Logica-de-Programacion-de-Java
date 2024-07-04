package clasestring.complementarios;

import java.util.Scanner;

public class reemplazo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Escribe un programa que solicite al usuario ingresar una frase y dos
        // caracteres. Utiliza el método replace() de la clase String para reemplazar
        // todas las ocurrencias del primer carácter con el segundo carácter en la frase
        // ingresada por el usuario. Muestra la frase resultante en pantalla.

        try {
            System.out.println("Ingresa una frase:");
            String frase = sc.nextLine();

            System.out.println("Ingresa el primer carácter (a ser reemplazado):");
            char primerCaracter = sc.next().charAt(0);

            System.out.println("Ingresa el segundo carácter (reemplazo):");
            char segundoCaracter = sc.next().charAt(0);

            String fraseModificada = frase.replace(primerCaracter, segundoCaracter);

            // Mostrar la frase resultante en pantalla
            System.out.println("La frase resultante es: " + fraseModificada);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e);
        } finally {

            sc.close();
        }

    }
}
