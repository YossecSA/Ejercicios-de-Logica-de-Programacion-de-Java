package estructuracontrol.switchteoria;

import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // En esta actividad, escribirás un programa que solicite al usuario ingresar un
        // número del 1 al 7, que representará un día de la semana. Luego, el programa
        // mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la
        // estructura "switch" para implementar este programa.

        System.out.print("Ingresa un numero: ");
        Integer num = sc.nextInt();


        String dia = switch (num) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número no válido";
        };

        System.out.println("El día de la semana es: " + dia);

        sc.close();
    }
}
