import java.util.Scanner;

public class MiScanner {

    // Formas de leer y convertir los datos
    // static Scanner miScanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Formas de leer y convertir los datos
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = miScanner.nextInt();

        // Consumir el salto de línea pendiente
        miScanner.nextLine();

        // Datos booleanos
        System.out.print("¿Eres varón? (true/false): ");
        boolean verdadero = miScanner.nextBoolean();

        // Consumir el salto de línea pendiente
        miScanner.nextLine();

        // Datos de texto (String)
        System.out.print("Ingresa tu nombre: ");
        String nombre = miScanner.nextLine();

        // Datos de punto flotante (double)
        System.out.print("Ingresa tu altura en metros: ");
        double altura = miScanner.nextDouble();

        System.out.println("El número ingresado es: " + numero);
        System.out.println("¿Eres varón?: " + verdadero);
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu altura es: " + altura + " metros");
        miScanner.close();
    }
}