package desafio1;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean esPrimo = true;
        do {
            System.out.println("Ingrese un numero entero: ");
            int numeroIngresado = sc.nextInt();

            if (numeroIngresado == 0) {
                System.out.println("Programa terminado.");
                break;
            }

            for (int i = 2; i <= numeroIngresado / 2; i++) {
                if (numeroIngresado % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numeroIngresado + " es un número primo.");
            } else {
                System.out.println(numeroIngresado + " no es un número primo. Intente de nuevo.");
            }

        } while (true);

        sc.close();
    }
}
