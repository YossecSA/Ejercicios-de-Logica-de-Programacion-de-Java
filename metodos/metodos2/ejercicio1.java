package metodos.metodos2;

import java.util.Scanner;

public class ejercicio1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = solicitarNumero();

        System.out.println(esPar(numero) ? "El numero es Par" : "El numero es Impar");

    }
    // Es par: Reemplaza la lógica de pedir un número por un método llamado
    // "solicitarNumero()" que no reciba parámetros y devuelva un entero. También
    // reemplaza la condición del if por un método llamado "esPar()" que reciba por
    // parámetro un entero y devuelva un booleano.

    public static Integer solicitarNumero() {
        while (true) {
            System.out.println("Por favor ingrese un número:");
            try {
                return sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
                
            }
        }
    }

    public static Boolean esPar(int numero) {

        return (numero % 2 == 0); //devuelve true o false 
    }
}
