package array;

import java.util.Scanner;

public class complementario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //generarNumero();
        //sumaElementosPares();
        nombreAlfabeticamente(sc);
        sc.close();
    }

    public static void generarNumero() {
        // Escribe un programa en el que se cree una variable de tipo array que contenga
        // seis elementos de tipo entero. El programa debe contar la cantidad de
        // elementos pares presentes en el array y mostrar el resultado por consola
        // utilizando solo las herramientas aprendidas hasta el momento.

        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        int contadorPares = 0;

        if (numeros[0] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[1] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[2] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[3] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[4] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[5] % 2 == 0) {
            contadorPares++;
        }

        System.out.println("La cantidad de elementos pares en el array es: " + contadorPares);
    }

    public static void sumaElementosPares() {
        int[] numeros = { 10, 20, 30, 40, 50 };

        int suma = numeros[0] + numeros[2] + numeros[4];

        System.out.println("La suma de los elementos en las posiciones pares es: " + suma);
    }
    public static void nombreAlfabeticamente(Scanner sc) {
        String[] nombres = new String[4];

        System.out.print("Ingrese el primer nombre: ");
        nombres[0] = sc.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        nombres[1] = sc.nextLine();

        System.out.print("Ingrese el tercer nombre: ");
        nombres[2] = sc.nextLine();

        System.out.print("Ingrese el cuarto nombre: ");
        nombres[3] = sc.nextLine();


        if (nombres[0].compareTo(nombres[1]) > 0) {
            String temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }
        if (nombres[0].compareTo(nombres[2]) > 0) {
            String temp = nombres[0];
            nombres[0] = nombres[2];
            nombres[2] = temp;
        }
        if (nombres[0].compareTo(nombres[3]) > 0) {
            String temp = nombres[0];
            nombres[0] = nombres[3];
            nombres[3] = temp;
        }
        if (nombres[1].compareTo(nombres[2]) > 0) {
            String temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }
        if (nombres[1].compareTo(nombres[3]) > 0) {
            String temp = nombres[1];
            nombres[1] = nombres[3];
            nombres[3] = temp;
        }
        if (nombres[2].compareTo(nombres[3]) > 0) {
            String temp = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = temp;
        }

        System.out.println("Nombres ordenados alfabéticamente:");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

    
    }
}
