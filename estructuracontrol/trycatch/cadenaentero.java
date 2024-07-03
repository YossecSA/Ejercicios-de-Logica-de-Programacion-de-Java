package estructuracontrol.trycatch;

import java.util.Scanner;

public class cadenaentero {
    public static void main(String[] args) {

        // Escribe un programa que solicite al usuario ingresar una cadena de caracteres
        // que represente un número entero. Utiliza el método Integer.parseInt() para
        // convertir la cadena en un número entero. Implementa un bloque "try-catch"
        // para manejar la excepción en caso de que la cadena ingresada no pueda ser
        // convertida en un número entero. En caso de que se produzca la excepción,
        // muestra un mensaje apropiado en la pantalla.

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese una letra: ");
            String input = sc.nextLine();

            int numero = Integer.parseInt(input);
            System.out.println("El número entero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no puede ser convertida en un número entero.");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
        }
    }
}
