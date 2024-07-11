package bucles.buclefor;

import java.util.Arrays;
import java.util.Scanner;

public class complementarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio1();
        ejercicio2();
        sc.close();
    }
    // Escribe un programa que recorra un array de enteros y lo invierta, es decir,
    // que el primer elemento se convierta en el último y viceversa, luego imprime
    // el array resultante por consola. El tamaño y los números a contener pueden
    // ser de tu elección.

    // IMPORTANTE: Debes invertir de forma permanente el orden de los elementos.
    // Analiza si necesitas hacer uso de elementos auxiliares para concluir el
    // ejercicio.

    public static void ejercicio1() {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int n = numeros.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(numeros));
    }

    // Escribe un programa que recorra un array de enteros y calcule la suma
    // acumulada de los elementos, reemplazando cada elemento por la suma acumulada
    // hasta ese punto.El tamaño y los números a contener pueden ser de tu elección.
    public static void ejercicio2() {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 1; i < numeros.length; i++) {
            numeros[i] += numeros[i - 1];
        }
        System.out.println(Arrays.toString(numeros));
    }
}
