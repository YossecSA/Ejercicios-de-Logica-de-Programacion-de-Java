package Math;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Escribe un programa que genere y muestre en pantalla un número aleatorio en
        // el rango del 1 al 355 utilizando el método random() de la clase Math. Puedes
        // utilizar el método floor() para redondear el número aleatorio hacia abajo.

        System.out.print("Cuantos numeros, quieres generar: ");
        int generador = sc.nextInt();

        int contador = 1;
        while (contador <= generador) {
            double randomDouble = Math.random();
            int numRandom = (int) Math.floor(randomDouble * 355) + 1;

            System.out.println(contador + ") => " + numRandom);

            contador++;
        }

        sc.close();
    }
}
