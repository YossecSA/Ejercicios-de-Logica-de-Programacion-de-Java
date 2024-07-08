package Math;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero base: ");
        int base = sc.nextInt();

        System.out.println("Ingresa el numero potencia: ");
        int potencia = sc.nextInt();

        int resultado = (int) Math.pow(base, potencia);
        System.out.println("El resultado es: " + resultado);
        sc.close();
    }
}
