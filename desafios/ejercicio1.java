package desafios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer valor: ");
        double valor1 = sc.nextDouble();

        String resultado = (valor1 % 2 == 0) ? "par" : "impar";
        System.out.print("El valor ingresado es: " + resultado);
        sc.close();
    }
}
