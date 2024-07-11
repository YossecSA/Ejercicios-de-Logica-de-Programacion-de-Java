package bucles.bucleforreach;

import java.util.Scanner;

public class complementario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ejercicio1(scanner);

        scanner.close();
    }
    // ✨ Este ejercicio es de tipo complementario. Esto quiere decir que te ayudará
    // a avanzar en profundidad en el tema visto, pero no es obligatorio.

    // Contar ocurrencias

    // Escribe un programa que cree un array de 50 elementos de tipo carácter,
    // inicializándolo con una frase elegida. Luego, solicita al usuario un carácter
    // objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente,
    // imprime el resultado por consola.

    // Por ejemplo, si el array contiene la siguiente frase:

    // a p r e n d i e n d o j a v a
    // y el usuario ingresa el carácter 'd', el programa debería devolver la
    // siguiente salida:

    // El carácter "d" aparece 2 veces.

    // Si el usuario ingresa el carácter 'z', el programa debería devolver la
    // siguiente salida:

    // El carácter "z" no aparece en la frase.

    public static void ejercicio1(Scanner scanner) {

        System.out.print("Ingrese una frase: ");
        String fraseIngresada = scanner.nextLine();

        char[] frase = fraseIngresada.toCharArray();

        System.out.print("Ingrese el carácter objetivo: ");
        char objetivo = scanner.next().charAt(0);

        int contador = 0;
        for (char c : frase) {
            if (c == objetivo) {
                contador++;
            }
        }

        // Imprimir el resultado por consola
        if (contador > 0) {
            System.out.println("El carácter \"" + objetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase.");
        }

    }
}
