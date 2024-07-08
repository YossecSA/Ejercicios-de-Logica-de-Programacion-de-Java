package Math;

import java.util.Scanner;

public class absoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Escribe un programa que pida al usuario un número entero y muestra en
        // pantalla su valor absoluto utilizando el método abs() de la clase Math.

        System.out.println("Ingresa un valor: ");
        int num = sc.nextInt();
        System.out.println("El valor absoluto es: " + Math.abs(num));

        // Escribe un programa que pida al usuario un número decimal y muestra en
        // pantalla su valor redondeado utilizando el método round() de la clase Math.

        System.out.print("Ingresa un decimal: ");
        double decimal = sc.nextDouble();

        System.out.println("Su valor redondeado es: " + Math.round(decimal));
        sc.close();

    }
}
