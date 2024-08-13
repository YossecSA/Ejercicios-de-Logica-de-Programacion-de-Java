package metodos.metodos2;

import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.print("Ingresa el tamaño del array: ");
        int tamaño = scanner.nextInt();

        System.out.print("Ingresa el valor mínimo del rango: ");
        int minimo = scanner.nextInt();

        System.out.print("Ingresa el valor máximo del rango: ");
        int maximo = scanner.nextInt();

        int[] arrayAleatorio = generarArrayAleatorio(tamaño, minimo, maximo);

        System.out.println("Array generado aleatoriamente:");
        imprimirArray(arrayAleatorio);
    }

    public static int numeroAleatorio(int minimo, int maximo) {
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
    public static int[] generarArrayAleatorio(int tamaño, int minimo, int maximo) {
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = numeroAleatorio(minimo, maximo);
        }
        return array;
    }
    public static void imprimirArray(int[] array) {
        for (int i : array) {   
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
