package estructuracontrol.ifteoira;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // En esta actividad, escribirás un programa que solicite al usuario un número y
        // determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado
        // se mostrará en pantalla.

        System.out.print("Ingresa un numero: ");
        double numero = sc.nextDouble();

        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("El numero es divisible por 5 y por 3");
            
        } else if (numero % 5 == 0) {
            System.out.println("El numero es divisible por 5");

        } else if (numero % 3 == 0) {
            System.out.println("El numero es divisible por 3");
        } else {
            System.out.println("El numero no es divisible ni por 5 ni por 3");
        }

        sc.close();
    }
}
