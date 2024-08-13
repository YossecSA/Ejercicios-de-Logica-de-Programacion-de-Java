package metodos.metodos2;

import java.util.Scanner;

public class ejercicio3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nota = solicitarNota();
        String calificacion = obtenerNota(nota);
        System.out.println("La calificación es: " + calificacion);
    }

    // Ejercicio de calificación: Basándote en el siguiente ejercicio que ya has
    // realizado, crea un método "obtenerNota()" que reciba por parámetro un "int" y
    // devuelva un "String". El método debe utilizar la estructura de control
    // "switch expression".
    public static Integer solicitarNota() {
        while (true) {
            System.out.println("Por favor ingrese una nota entre 0 y 100:");
            try {
                int nota = sc.nextInt();
                if (nota >= 0 && nota <= 100) {
                    return nota;
                } else {
                    System.out.println("La nota debe estar entre 0 y 100. Intente nuevamente.");
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("No ingresó un número válido, intente nuevamente.");
            }
        }
    }

    public static String obtenerNota(int nota) {
        return switch (nota) {
            case 90, 100 -> "A"; // nota entre 90-100
            case 80 -> "B"; // nota entre 80-89
            case 70 -> "C"; // nota entre 70-79
            case 60 -> "D"; // nota entre 60-69
            default -> "F"; // nota menos de 60
        };
        
    }
}
