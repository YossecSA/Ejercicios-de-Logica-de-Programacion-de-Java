package estructuracontrol;

import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el numero: ");
        double valor = sc.nextDouble();

        String respuesta = (valor > 0) ? "POSITIVO" 
                        :(valor < 0) ? "NEGATIVO" 
                        : "CERO";

        System.out.println("El numero es: " + respuesta);

        sc.close();
    }
}
