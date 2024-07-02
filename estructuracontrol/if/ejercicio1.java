package estructuracontrol;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // un programa que solicite al usuario ingresar un número entre 0 y 100.

        // variable nota
        String calificacion = "";

        System.out.println("Ingresa un numero entre el 0 - 100");
        System.out.print("Numero: ");
        double numero = sc.nextDouble();

        if (numero < 0 || numero > 100) {
            System.out.println("El numero ingresado esta fuera del rango");

        } else if (numero >= 90 && numero <= 100) {
            calificacion = "A";

        } else if (numero >= 80 && numero <= 89) {
            calificacion = "B";

        } else if (numero >= 70 && numero <= 79) {
            calificacion = "C";

        } else if (numero >= 60 && numero <= 69) {
            calificacion = "D";

        } else { // control para valor menos del 60
            calificacion = "F";

        }

        System.out.println("Su calificacion es: " + calificacion);

        sc.close();
    }
}
