package metodos;

import java.util.Scanner;

public class ejercicio2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = pedirNombre();
        int edad = pedirEdad();

        imprimirNombre(nombre);
        imprimirNombreYEdad(nombre, edad);

    }

    public static String pedirNombre() {
        System.out.println("Ingrese su nombre: ");
        return sc.nextLine();
    }

    public static int pedirEdad() {
        System.out.println("Por favor ingrese una edad:");
        return sc.nextInt();
    }

    public static void imprimirNombre(String name) {
        System.out.println("Mi nombre es " + name);
    }

    public static void imprimirNombreYEdad(String name, int edad) {
        System.out.println("Mi nombre es " + name + " y tengo " + edad);
    }
}
