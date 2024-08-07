package metodos;

import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();

        System.out.println("Por favor ingrese una edad:");
        int edad = sc.nextInt();
        imprimirNombreYEdad(name, edad);

        

        sc.close();
    }
    // Imprimir nombre: Crea un método llamado imprimeNombre() que reciba por
    // parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]".
    // Invocar dicho método desde el método main para ver el mensaje por consola

    public static void imprimirNombre(String name){
        System.out.println("Mi nombre es " + name);
    }

    public static void imprimirNombreYEdad(String name, int edad){
        System.out.println("Mi nombre es " + name + " y tengo " + edad);
    }
}
