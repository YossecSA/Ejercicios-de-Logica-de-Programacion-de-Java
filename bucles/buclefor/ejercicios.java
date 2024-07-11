package bucles.buclefor;

import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ejercicio1();
        //ejercicio2();
        ejercicio3();
        sc.close();
    }
    // Escribe un programa que recorra un array de enteros y muestre cada elemento
    // en una línea separada. El tamaño, tipo de datos y la información a contener
    // pueden ser de tu elección.

    public static void ejercicio1() {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    // Escribe un programa que recorra un array de enteros y encuentre el valor
    // mínimo presente en el array. El tamaño y los números a contener pueden ser de
    // tu elección.
    public static void ejercicio2() {

        int[] numeros = { 23, 45, 12, 67, 34, 89, 5, 78, 10 };
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El valor mínimo en el array es: " + minimo);
    }

    // Escribe un programa que recorra un array de enteros y los imprima en orden
    // inverso, comenzando desde el último elemento.. El tamaño y los números a
    // contener pueden ser de tu elección.
    public static void ejercicio3() {

        int[] numeros = { 23, 45, 12, 67, 34, 89, 5, 78, 10 };

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
