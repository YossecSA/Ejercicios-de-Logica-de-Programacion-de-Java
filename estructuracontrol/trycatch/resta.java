package estructuracontrol.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class resta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Escribe un programa que solicite al usuario ingresar dos números. Luego,
        // realiza la resta del primer número menos el segundo número. Implementa un
        // bloque "try-catch" para manejar las excepciones que puedan surgir en caso de
        // que el usuario no ingrese números. En caso de que se produzca una excepción,
        // muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción,
        // muestra el resultado de la resta.

        try {
            System.out.print("Ingresa el primer numero: ");
            double num1 = sc.nextInt();

            System.out.print("Ingresa el segundo numero: ");
            double num2 = sc.nextInt();

            double resultado = num1 - num2;

            System.out.println("La respuesta es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado es incorrecto. Por favor, ingrese un número válido.");

        } catch (Exception e) {

            System.out.println("ERROR: " + e);

        } finally {
            sc.close();
        }

    }
}
