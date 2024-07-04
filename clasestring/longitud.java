package clasestring;

import java.util.Scanner;

public class longitud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ====== ejercicio 1 =============");
        // Escribe un programa que pida al usuario ingresar una cadena de texto y
        // muestre en pantalla su longitud utilizando el método length() de la clase
        // String.

        System.out.print("Ingresa un texto: ");
        String texto = sc.nextLine();

        System.out.println("La longitud del texto es: " + texto.length());


        System.out.println(" ====== ejercicio 2 =============");

        // Escribe un programa que solicite al usuario ingresar su nombre y apellido por
        // separado, y luego muestre en pantalla el nombre completo utilizando el método
        // concat() de la clase String.

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa tu apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Nombre completo es: " + nombre.concat(" ").concat(apellido));

        sc.close();
    }
}
