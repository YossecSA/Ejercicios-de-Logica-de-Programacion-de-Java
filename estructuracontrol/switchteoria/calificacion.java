package estructuracontrol.switchteoria;

import java.util.Scanner;

public class calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // En esta actividad, desarrollarás un programa que solicitará al usuario
        // ingresar una calificación numérica del 1 al 5. Luego, mostrará en pantalla la
        // calificación correspondiente en letras, utilizando la siguiente escala:

        System.out.print("Ingresa un numero: ");
        Integer num = sc.nextInt();

        String calificacion = switch (num) {
            case 1 -> "Muy deficiente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> "Calificacion no valido";
        };

        System.out.println(calificacion);

        sc.close();
    }
}
