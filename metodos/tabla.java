package metodos;

import java.util.Scanner;

public class tabla {
    // En esta actividad, vas a crear un programa que solicita al usuario que
    // ingrese un número (incluida la lógica en un método llamado pedirNumero()) y
    // luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la
    // lógica en un método llamado imprimirTablaMultiplicar()). Para ello,
    // implementarás un método que reciba el número ingresado por el usuario y que
    // imprima la tabla de multiplicar correspondiente.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = pedirNumero();
        imprimirTabla(numero);

    }

    public static int pedirNumero() {
        System.out.print("Ingrese un numero entero: ");
        return sc.nextInt();
    }

    public static void imprimirTabla(int numero) {
        System.out.println("La tabla de multiplicar del Numero: " + numero);
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
