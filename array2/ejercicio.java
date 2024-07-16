package array2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // orden();
        // busqueda(sc);
        // comparacion();
        // copiarArreglo(sc);
        relleno(sc);
        sc.close();
    }

    // Escribe un programa en el que declares una variable de tipo array que
    // contenga 10 elementos de tipo entero. Inicializa el arreglo con valores
    // aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego
    // ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente,
    // imprime los elementos ordenados en la consola.

    public static void orden() {
        Integer[] numeros = new Integer[10];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) Math.floor(Math.random() * 100) + 1;
        }
        System.out.println("Array inicial: " + Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }

    // La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en
    // una lista ordenada de elementos. La clase Arrays ya incluye su implementación
    // mediante el método binarySearch(). Escribe un programa que realice una
    // búsqueda binaria en un arreglo ordenado de enteros utilizando el método
    // Arrays.binarySearch(). El programa debe imprimir el arreglo generado
    // originalmente, solicitar al usuario el valor buscado e imprimir el índice del
    // valor buscado si está presente en el arreglo.

    public static void busqueda(Scanner sc) {
        int[] numeros = { 1, 2, 25, 80, 75, 96, 34 };
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        System.out.print("Numero a buscar: ");
        int busqueda = sc.nextInt();

        int indice = Arrays.binarySearch(numeros, busqueda);

        if (indice >= 0) {
            System.out.println("El numero se encuentra en la posicion: " + indice);

        } else {
            System.out.println("El numero no se encuentra en el sistema");
        }

    }

    // Escribe un programa que compare dos arreglos de enteros utilizando el método
    // Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.

    public static void comparacion() {
        int[] listaNumeros = { 1, 2, 3, 4, 5, 6 };

        int[] nuevaLista = { 1, 2, 3, 4, 6, 5 };

        if (Arrays.equals(listaNumeros, nuevaLista)) {
            System.out.println("La lista son iguales");
        } else {
            System.out.println("La lista no son iguales");
        }
    }

    // Crea un programa en Java que declare y muestre un arreglo de enteros junto
    // con sus índices. Luego, solicita al usuario dos índices: un índice inicial y
    // un índice final. Con estos dos índices, copia la parte del arreglo original
    // comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método
    // Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el
    // índice inicial es menor que el índice final y que ambos índices están dentro
    // del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo
    // por consola.

    public static void copiarArreglo(Scanner sc) {
        int[] numeros = { 1, 2, 25, 80, 75, 96, 34 };

        System.out.println("Arreglo original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        System.out.print("Ingrese el índice inicial: ");
        int indiceInicial = sc.nextInt();

        System.out.print("Ingrese el índice final: ");
        int indiceFinal = sc.nextInt();

        if (indiceInicial < 0 || indiceFinal >= numeros.length || indiceInicial > indiceFinal) {
            System.out.println(
                    "Índices no válidos. Asegúrese de que el índice inicial sea menor o igual al índice final y ambos estén dentro del rango válido.");
            return;
        }

        int[] nuevoArreglo = Arrays.copyOfRange(numeros, indiceInicial, indiceFinal + 1);

        System.out.println("Nuevo arreglo copiado:");
        System.out.println(Arrays.toString(nuevoArreglo));
    }

    // El método fill() de la clase Arrays cambia todos los elementos en un arreglo
    // por un valor estático, desde el índice start (por defecto 0) hasta el índice
    // end (por defecto array.length) y devuelve el arreglo modificado. Vamos a
    // escribir un programa que solicite al usuario el tamaño para un arreglo y un
    // número entero con el que quiera rellenarlo. Luego crea el arreglo y utiliza
    // Arrays.fill(). Finalmente, imprime el arreglo resultante.
    public static void relleno(Scanner sc) {
        System.out.println("Ingrese el tamaño del array: ");
        int tamaño = sc.nextInt();

        System.out.println("Ingrese un numero entero para llenar el array: ");
        int numero = sc.nextInt();

        int[] numeros = new int[tamaño];

        Arrays.fill(numeros, numero);
        System.out.println("El array es: " + Arrays.toString(numeros));

    }

}
