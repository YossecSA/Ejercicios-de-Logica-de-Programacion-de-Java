package clasestring;

import java.util.Scanner;

public class busqueda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Escribe un programa que pida al usuario ingresar una palabra y un carácter, y
        // determine si el carácter ingresado se encuentra en la palabra utilizando el
        // método indexOf() de la clase String. Muestra un mensaje adecuado en pantalla
        // indicando si el carácter se encuentra o no en la palabra.

        System.out.println("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        System.out.println("Buscar caracter: ");
        String caracter = sc.nextLine();

        int indice = palabra.indexOf(caracter);

        if (indice > 0) {
            System.out.println("Se encontro el caracter en la palabra");
        } else {
            System.out.println("No se encontro el caracter en la palabra");

        }

        // Escribe un programa que pida al usuario ingresar una cadena de texto y
        // muestre en pantalla la misma cadena, pero con todos los caracteres en
        // mayúsculas o minúsculas. Utiliza los métodos toUpperCase() y toLowerCase() de
        // la clase String para realizar la conversión.

        System.out.println("========== ejercicio 2 ================");

        System.out.println("Texto es minuscula: " +palabra.toLowerCase());
        System.out.println("Texto es mayuscula: " +palabra.toUpperCase());

        sc.close();
    }
}
