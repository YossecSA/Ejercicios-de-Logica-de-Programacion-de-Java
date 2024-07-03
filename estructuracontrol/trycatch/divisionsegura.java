package estructuracontrol.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divisionsegura {
    public static void main(String[] args) {
        // Escribe un programa que pida al usuario que ingrese dos números enteros y
        // realice la división del primer número entre el segundo número. Implementa un
        // bloque "try-catch" para manejar la excepción en caso de que se intente
        // realizar una división por cero. En caso de que ocurra la excepción, muestra
        // un mensaje apropiado en la pantalla.

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero: ");
            double num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            double num2 = sc.nextInt();

            double resultado = num1 / num2;

            System.out.println("El resultado de la división de: num1 = " + num1 + " num2 = " + num2 + " = "  + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");

        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado es incorrecto");

        } catch (Exception e) {
            e.printStackTrace(); // muestra en q parte ocurrio el problema;
            System.out.println("Error: " + e);

        } finally {
            sc.close();
        }
    }
}
