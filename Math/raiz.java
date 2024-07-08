package Math;

import java.util.Scanner;

public class raiz {
    public static void main(String[] args) {

        // Escribe un programa que cumpla con las siguientes condiciones:

        // Pide al usuario que ingrese un número entre 1 y 30. Este número será
        // almacenado en una variable llamada numeroLimite .

        // Utiliza la clase Math para generar un número aleatorio entre 1 y el
        // numeroLimite recibido del usuario.

        // Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número
        // aleatorio generado y muéstralo en pantalla.

        // Analiza si el número aleatorio generado es primo y muestra un mensaje en
        // pantalla indicando si lo es o no.

        // Finalmente, muestra el número aleatorio generado y su raíz cuadrada en
        // pantalla.
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entre 1 y 30: ");
            int numeroLimite = sc.nextInt();

            if (numeroLimite < 1 || numeroLimite > 30) {
                System.out.println("El número ingresado no está en el rango permitido.");
                return;
            }
            // Generar un número aleatorio entre 1 y numeroLimite
            int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;

            double raizCuadrada = Math.sqrt(numeroAleatorio); // Calcular la raíz cuadrada del número aleatorio generado

            boolean esPrimo = esNumeroPrimo(numeroAleatorio); // Verificar si el número aleatorio es primo

            // Mostrar los resultados en pantalla
            System.out.println("Número aleatorio generado: " + numeroAleatorio);
            System.out.println("Raíz cuadrada del número " + numeroAleatorio + " es: " + raizCuadrada);

            String resultadoPrimo = (esPrimo) ? "El número aleatorio es primo." : "El número aleatorio no es primo.";
            System.out.println(resultadoPrimo);

        } catch (Exception e) {

            System.out.println("Error: " + e);
        } finally {

            sc.close();
        }
    }

    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
