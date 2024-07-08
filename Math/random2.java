package Math;

import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Escribe un programa que pida al usuario ingresar dos números enteros: un
        // límite inferior y un límite superior. Luego, utiliza el método random() de la
        // clase Math para generar y mostrar en pantalla un número aleatorio dentro del
        // rango especificado por los límites ingresados.

        System.out.println("Ingresar el rango de valores: ");
        System.out.print("Primer valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.print("¿Cuantos numeros quiere generar? ");
        int generador = sc.nextInt();

        int contador = 1;

        System.out.println("El valor generado de: " + valor1 + " hasta el " + valor2 + " es: ");
        while (contador <= generador) {

            int resultado = (int) Math.floor(Math.random() * valor2) + valor1;

            System.out.println(contador + ") " + resultado);

            contador++;
        }
        sc.close();
    }
}
