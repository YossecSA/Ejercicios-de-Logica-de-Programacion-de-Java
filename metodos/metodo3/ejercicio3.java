package metodos.metodo3;

import java.util.Scanner;

public class ejercicio3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingresa un número para verificar si es primo: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero, 2)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return esPrimo(n, divisor + 1);
    }
}
