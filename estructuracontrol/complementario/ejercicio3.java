package estructuracontrol.complementario;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // En este ejercicio, desarrollarás un programa que solicite al usuario su edad
        // y determine en qué categoría se encuentra. Las categorías son las siguientes:

        // Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".

        // Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres
        // adulto".

        // Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto
        // mayor".
        String mensaje = "";

        System.out.println("Ingresa tu edad: ");
        Integer edad = sc.nextInt();

        if (edad < 18 && edad >= 0) {
            mensaje = "Eres menor de edad";
        } else if (edad >= 18 && edad <= 64) {
            mensaje = "Eres adulto";
        } else if (edad >= 65) {
            mensaje = "Eres un adulto mayor";
        } else {
            mensaje = "La edad es incorrecta";
        }

        System.out.println(mensaje);
        sc.close();
    }
}
