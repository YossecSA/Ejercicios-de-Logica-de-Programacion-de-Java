package array2;

import java.util.Scanner;

public class complementario {

    // Rellenando un arreglo de manera personalizada

    // Escribe un programa en Java que realice lo siguiente:

    // Solicita al usuario un tamaño para un arreglo.

    // Luego, pídele que ingrese un número con el que desea rellenar el array.

    // Solicita el índice hasta el cual quiere rellenar el array con el número
    // anterior.

    // El array deberá ser rellenado con el número proporcionado hasta el índice
    // ingresado por el usuario.

    // Asegúrate de validar lo siguiente:

    // La primera vez que se pide al usuario un número para rellenar el arreglo, el
    // índice inicial debe ser 0.

    // Si el índice ingresado no es el índice del último elemento del arreglo, el
    // programa debe continuar pidiendo al usuario nuevos números e índices para
    // rellenar el arreglo.

    // El índice siempre debe ser menor que el tamaño total del arreglo.

    // Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice
    // ingresado debe ser mayor que el último índice ingresado; a su vez, se debe
    // rellenar el array con el nuevo número desde el índice anterior hasta el nuevo
    // índice.

    // Por último, el programa debe imprimir por consola el arreglo completo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de un arreglo: ");
        int tamano = sc.nextInt();

        // Validar el tamaño del arreglo
        if (tamano <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            
        }

        int[] arreglo = new int[tamano];

        int ultimoIndice = -1;

        while (ultimoIndice < tamano - 1) {
            System.out.print("Ingrese un número para rellenar el arreglo: ");
            int numero = sc.nextInt();

            System.out.print("Ingrese el índice hasta el cual desea rellenar el arreglo con el número ingresado: ");
            int indice = sc.nextInt();

            if (indice <= ultimoIndice || indice >= tamano) {
                System.out.println("El índice ingresado no es válido. Debe ser mayor que el último índice ingresado y menor que el tamaño del arreglo.");
                continue;
            }

            for (int i = ultimoIndice + 1; i <= indice; i++) {
                arreglo[i] = numero;
            }

            ultimoIndice = indice;
        }
        System.out.println("Arreglo completo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }


        sc.close();
    }
}
