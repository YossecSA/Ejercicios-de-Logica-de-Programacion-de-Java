package estructuracontrol;

import java.util.Scanner;

public class controlIf {
    public static void main(String[] args) {
        // En esta actividad, deberás escribir un programa que solicite al
        // usuario un número y determine si es positivo, negativo o cero. El resultado

        Scanner miScanner = new Scanner(System.in);
        
        // se mostrará en pantalla.
        while (true) {
            System.out.print("Ingresa un numero: ");
            double valor = miScanner.nextDouble();

            // Evalucion
            if (valor > 0) {
                System.out.println("El numero es positivo");
            } else if (valor < 0) {
                System.out.println("El numero es negativo");
            } else {
                System.out.println("El numero es 0");
                break;
            }
        }

        miScanner.close();
    }
}
