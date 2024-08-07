package metodos;

import java.util.Scanner;

public class tabla2 {

    // En esta actividad, vas a crear un programa que solicita al usuario que
    // ingrese 3 números (incluida la lógica en un método llamado pedirNumeros()) y
    // luego imprime la tabla de multiplicar de cada uno de ellos 1 al 10 (incluida
    // la lógica en un método llamado imprimirTablasMultiplicar(int[] numeros)).
    // Para ello, implementarás un un array para almacenar los números ingresados y
    // luego invocarás el método para cada uno de ellos.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablasMultiplicar(numeros);
    }

    public static int[] pedirNumeros() {
        int[] numeros = new int[3];

        System.out.println("Por favor, ingresa 3 números:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        return numeros;
    }

    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println();
        }
    }
}
