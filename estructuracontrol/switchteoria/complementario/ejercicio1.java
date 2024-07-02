package estructuracontrol.switchteoria.complementario;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // En este ejercicio, crearás un programa que pedirá al usuario ingresar un
        // número del 1 al 7, representando un día de la semana. El programa determinará
        // si ese día es hábil o no. Se mostrará el resultado en pantalla. Se considera
        // que los días hábiles son del 1 al 5 (de lunes a viernes). Utilizaremos la
        // estructura "switch" para implementar este programa. ( Ten en cuenta que los
        // días hábiles son del 1 al 5 (de lunes a viernes).)

        System.out.print("Ingrese un numero: ");
        Integer num = sc.nextInt();

        String mensaje = switch (num) {
            case 1 ,2,3,4,5 -> "Dia habil";
            case 6,7 -> "Dia no habil";
            default -> "Opcion invalida";
        };
        System.out.println(mensaje);

        sc.close();
    }
}
