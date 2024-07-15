package bucles.buclewith;

import java.util.Scanner;

public class complementario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tablaMultiplicar(sc);
        //contarInparesPares(sc);
        calculadora(sc);
        sc.close();
    }

    // Escribe un programa que solicite al usuario un número entero y muestre la
    // tabla de multiplicar de ese número utilizando un bucle while. El programa
    // debe seguir solicitando números hasta que el usuario ingrese un valor igual a
    // cero, en cuyo caso debería salir del bucle.

    public static void tablaMultiplicar(Scanner sc) {

        while (true) {
            System.out.print("Ingrese un numero entero: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            System.out.println("=====================");
            int contador = 1;
            while (contador <= 12) {
                System.out.println(numero + " * " + contador + " = " + numero * contador);
                contador++;
            }
            System.out.println("=====================");
        }
    }

    // Escribe un programa que solicite al usuario ingresar una serie de números
    // enteros. Utiliza un bucle while para contar la cantidad de números pares e
    // impares ingresados hasta que el usuario decida terminar la entrada de
    // números. Al finalizar, muestra la cantidad de números pares e impares
    // ingresados
    public static void contarInparesPares(Scanner sc) {
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int numero;

        while (true) {
            System.out.print("Ingrese un número entero (0 para terminar): ");
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }

    // Crea un programa que solicite al usuario ingresar una serie de números
    // enteros positivos. Utiliza un bucle do-while para ir acumulando la suma de
    // los números ingresados. Después de cada entrada de número, pregunta al
    // usuario si desea ingresar otro número. Si el usuario responde
    // afirmativamente, continúa solicitando números; de lo contrario, muestra la
    // suma acumulada de todos los números ingresados y termina el programa.

    public static void calculadora(Scanner sc) {
        int sumaAcumulada = 0;
        String respuesta;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = sc.nextInt();

            if (numero > 0) {
                sumaAcumulada += numero;
            } else {
                System.out.println("Por favor, ingrese un número positivo.");
            }

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            respuesta = sc.next();
            
        } while (respuesta.equals("s"));

        System.out.println("La suma acumulada de los números ingresados es: " + sumaAcumulada);
        
    }
}
