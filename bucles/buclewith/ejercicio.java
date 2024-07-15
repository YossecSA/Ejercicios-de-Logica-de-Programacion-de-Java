package bucles.buclewith;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Opción:");
            System.out.println("1) Comprar producto.");
            System.out.println("2) Realizar devolución.");
            System.out.println("3) Ver mis pedidos.");
            System.out.println("4) Preguntas frecuentes.");
            System.out.println("5) Salir.");
            System.out.print("Seleccione una opción: ");
            int opcionSeleccionada = sc.nextInt();
            
            String mensaje = switch (opcionSeleccionada) {
                case 1 -> "Seleccionó la opción: Comprar producto.";
                case 2 -> "Seleccionó la opción: Realizar devolución.";
                case 3 -> "Seleccionó la opción: Ver mis pedidos.";
                case 4 -> "Seleccionó la opción: Preguntas frecuentes.";
                case 5 -> {
                    continuar = false;
                    yield "Saliendo del programa...";
                }
                default -> "Opción incorrecta. Por favor, seleccione una opción válida.";
            };
            System.out.println(mensaje);
        }
        sc.close();
    }
}