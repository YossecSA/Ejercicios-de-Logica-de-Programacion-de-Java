package desafio4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //factorial(sc);
        //fibonachi(sc);
        //primos(sc);
        //dibujarCuadrado(sc);
        graficoBarras(sc);
        sc.close();
    }

    // El objetivo de esta actividad es que desarrolles un programa que solicite al
    // usuario ingresar un número y posteriormente calcule su factorial mediante un
    // bucle do-while. El factorial de un número se define como el producto de todos
    // los enteros desde 1 hasta ese número. A continuación, te presentamos algunos
    // ejemplos para mayor claridad:

    // El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.

    // El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como
    // resultado 120.

    // Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que
    // da 5040.
    public static void factorial(Scanner sc) {
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= numero);

        System.out.println(factorial);
    }

    //fibonachi
    public static void fibonachi(Scanner scanner){
        System.out.print("Ingresa la posición en la serie de Fibonacci: ");
        int posicion = scanner.nextInt();

        if (posicion < 0) {
            System.out.println("La posición en la serie de Fibonacci no puede ser negativa.");
        } else {
            long[] serieFibonacci = new long[posicion + 1];
            serieFibonacci[0] = 0;

            if (posicion > 0) {
                serieFibonacci[1] = 1;
            }

            for (int i = 2; i <= posicion; i++) {
                serieFibonacci[i] = serieFibonacci[i - 1] + serieFibonacci[i - 2];
            }

            System.out.println("La serie de Fibonacci hasta la posición " + posicion + " es: " + Arrays.toString(serieFibonacci));
            System.out.println("El valor en la posición " + posicion + " de la serie de Fibonacci es " + serieFibonacci[posicion]);
        }
        
    }
    public static void primos(Scanner sc) {
        System.out.println("Ingrese la cantidad de números primos deseados: ");
        int cantidadDeseada = sc.nextInt();

        if (cantidadDeseada <= 0) {
            System.out.println("La cantidad de números primos debe ser mayor que 0.");
            return;
        }

        int[] numerosPrimos = new int[cantidadDeseada];
        int contadorPrimos = 0;
        int numero = 2;

        while (contadorPrimos < cantidadDeseada) {
            boolean esPrimo = true;
            if (numero < 2) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                numerosPrimos[contadorPrimos] = numero;
                contadorPrimos++;
            }
            numero++;
        }

        System.out.println("Los primeros " + cantidadDeseada + " números primos son: ");
        for (int i = 0; i < cantidadDeseada; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }
    }
    //dibujo de cuadrado
    public static void dibujarCuadrado(Scanner scanner){
        System.out.println("Ingrese el tamaño del lado del cuadrado: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void graficoBarras (Scanner scanner){
        int[] numeros = new int[4];
        boolean entradaValida = true;

        // Solicitar al usuario que ingrese 4 números entre 1 y 20
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + " (entre 1 y 20): ");
            int numero = scanner.nextInt();
            if (numero < 1 || numero > 20) {
                System.out.println("Número inválido. Debe estar entre 1 y 20.");
                entradaValida = false;
                break;
            }
            numeros[i] = numero;
        }
        if (entradaValida) {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print((i + 1) + ": "); // Número de barra
                for (int j = 0; j < numeros[i]; j++) {
                    System.out.print("*"); // Imprime la barra de asteriscos
                }
                System.out.println(); // Salto de línea después de cada barra
            }
        }
    }
}
