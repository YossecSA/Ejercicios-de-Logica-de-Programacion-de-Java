package clasestring.complementarios;

import java.util.Scanner;

public class igual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la primera palabra:");
        String palabra1 = sc.nextLine();

        System.out.println("Ingresa la segunda palabra:");
        String palabra2 = sc.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }
        sc.close();
    }
}
