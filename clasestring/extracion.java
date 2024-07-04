package clasestring;

import java.util.Scanner;

public class extracion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Escribe un programa que solicite al usuario ingresar una frase y dos números
        // enteros, que representen un índice inicial y un índice final. Utiliza el
        // método substring() de la clase String para extraer la subcadena que se
        // encuentra entre los índices ingresados por el usuario, y muestra la subcadena
        // resultante en pantalla.

        try {
            System.out.print("Ingresa una frase: ");
            String frase = sc.nextLine();

            System.out.print("Ingresa el inicial: ");
            Integer inicial = sc.nextInt();

            System.out.print("Ingresa el valor de 0 al " + frase.length() + ": ");
            Integer parteFinal = sc.nextInt();

            if (parteFinal > frase.length()) {
                System.out.println("El valor ingresado es mayor a la cantidad de letras existentes");
            } else {

                String cadena = frase.substring(inicial, parteFinal);

                System.out.println(cadena);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}
