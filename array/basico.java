package array;

import java.util.Arrays;
import java.util.Scanner;

public class basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sumaElementos();
        // promedioNumeros2(sc);
        //buscarElemento(sc);
        copiarElemento(sc);

        sc.close();
    }

    public static void sumaElementos() {
        // Escribe un programa en el cual se cree una variable de tipo array que
        // contenga tres elementos de tipo entero. El programa debe sumar los tres
        // elementos de forma manual e imprimir por consola el resultado utilizando
        // solamente las herramientas adquiridas hasta el momento.

        int[] numeros = { 15, 18, 4 };

        int suma = numeros[0] + numeros[1] + numeros[2];

        System.out.println("La suma es: " + suma);
    }

    public static void promedioNumeros(Scanner sc) {
        // Escribe un programa en el cual se cree una variable de tipo array que
        // contenga cuatro elementos de tipo entero. Estos elementos deben ser
        // ingresados por el usuario. El programa debe sumar y promediar los cuatro
        // elementos de forma manual e imprimir por consola el resultado, utilizando
        // solamente las herramientas adquiridas hasta el momento.

        int[] numeros = new int[4];

        System.out.print("Ingrese el número 1: ");
        numeros[0] = sc.nextInt();

        System.out.print("Ingrese el número 2: ");
        numeros[1] = sc.nextInt();

        System.out.print("Ingrese el número 3: ");
        numeros[2] = sc.nextInt();

        System.out.print("Ingrese el número 4: ");
        numeros[3] = sc.nextInt();

        int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];

        double promedio = suma / numeros.length;

        System.out.println("La suma de los elementos del array es: " + suma);
        System.out.println("El promedio de los elementos del array es: " + promedio);

    }

    public static void promedioNumeros2(Scanner sc) {
        int[] numeros = new int[4];
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = suma / numeros.length;

        System.out.println("La lista de numeros es: " + Arrays.toString(numeros));
        System.out.println("La suma de numeros es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }

    public static void buscarElemento(Scanner sc) {
        // El programa debe crear un array de tamaño 3 que almacene números enteros.
        // Luego, solicita un número al usuario y muestra por consola si ese número está
        // presente en el array o no. Es importante utilizar únicamente las herramientas
        // aprendidas hasta el momento, sin emplear bucles en el proceso.

        int[] numeros = { 10, 18, 75 };
        System.out.println("Ingresa un valor: ");
        int valor = sc.nextInt();

        boolean encontrado = (valor == numeros[0] || valor == numeros[1] || valor == numeros[2]);

        System.out.println((encontrado) ? "El numero esta presente" : "El numero no esta presente");
    }

    public static void copiarElemento(Scanner sc) {
        // Desarrolla un programa que inicie creando un array de 3 enteros, con valores
        // predeterminados. Posteriormente, genera una copia del mismo con una extensión
        // de 2 elementos adicionales.

        // Solicita al usuario que ingrese dos números para ser almacenados en las
        // nuevas posiciones del array.

        // Finalmente, muestra por consola el contenido del nuevo array.

        // Es esencial emplear exclusivamente las herramientas aprendidas hasta el
        // momento, evitando el uso de bucles en el proceso.

        int[] numeros = {1, 2, 3};
        int[] nuevosNumeros = new int[5];

        nuevosNumeros[0] = numeros[0];
        nuevosNumeros[1] = numeros[1];
        nuevosNumeros[2] = numeros[2];

        System.out.print("Ingresa el número 4: ");
        nuevosNumeros[3] = sc.nextInt();

        System.out.print("Ingresa el número 5: ");
        nuevosNumeros[4] = sc.nextInt();

        System.out.println("El contenido del nuevo array es: " + Arrays.toString(nuevosNumeros));

    }
}
