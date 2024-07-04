package clasestring.complementarios;

import java.util.Scanner;

public class longitud {
    public static void main(String[] args) {
        // En esta actividad, se solicita al usuario ingresar una cadena de texto y
        // calcular su longitud, pero esta vez sin contar los espacios en blanco. Para
        // lograr esto, se utilizará el método length() de la clase String y se
        // realizará un proceso adicional para excluir los espacios de la cuenta.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto:");
        String cadena = sc.nextLine();

        String cadenaSinEspacios = cadena.replace(" ", "");

        int longitudSinEspacios = cadenaSinEspacios.length();

        System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + longitudSinEspacios);

        sc.close();
    }
}
