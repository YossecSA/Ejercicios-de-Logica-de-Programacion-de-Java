package metodos.metodo3;

import java.util.Scanner;

public class ejercicio1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingresa la cantidad de posiciones de la serie de Fibonacci que deseas ver: ");
        int posiciones = scanner.nextInt();

        System.out.println("Serie de Fibonacci hasta la posición " + posiciones + ":");
        for (int i = 0; i <= posiciones; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
