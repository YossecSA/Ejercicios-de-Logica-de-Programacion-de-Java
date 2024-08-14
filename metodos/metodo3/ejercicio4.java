package metodos.metodo3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearOBorrarOracion(scanner);
                    break;
                case 2:
                    mostrarCantidadCaracteres();
                    break;
                case 3:
                    mostrarCantidadPalabras();
                    break;
                case 4:
                    mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    devolverPalabraPorPosicion(scanner);
                    break;
                case 6:
                    buscarPalabra(scanner, 0);
                    break;
                case 7:
                    modificarPalabra(scanner);
                    break;
                case 8:
                    agregarContenido(scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de opciones ---");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear oración");
        } else {
            System.out.println("1. Borrar oración");
        }
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Elija una opción: ");
    }

    private static void crearOBorrarOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese la oración: ");
            oracion = scanner.nextLine();
        } else {
            oracion = "";
            System.out.println("Oración borrada.");
        }
    }

    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de caracteres: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
        } else {
            String[] palabras = oracion.split("\\s+");
            System.out.println("Cantidad de palabras: " + palabras.length);
        }
    }

    private static void mostrarPalabrasOrdenadas() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
        } else {
            String[] palabras = oracion.split("\\s+");
            Arrays.sort(palabras);
            System.out.println("Palabras ordenadas alfabéticamente: " + String.join(", ", palabras));
        }
    }

    private static void devolverPalabraPorPosicion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese un número: ");
        int posicion = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        String[] palabras = oracion.split("\\s+");
        if (posicion > 0 && posicion <= palabras.length) {
            System.out.println("La palabra en la posición " + posicion + " es: " + palabras[posicion - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void buscarPalabra(Scanner scanner, int indice) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        if (indice >= palabras.length) {
            System.out.println("La palabra no fue encontrada.");
            return;
        }
        if (palabras[indice].equalsIgnoreCase(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" fue encontrada en la posición " + (indice + 1));
        } else {
            buscarPalabra(scanner, indice + 1);
        }
    }

    private static void modificarPalabra(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra a modificar: ");
        String palabraAntigua = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        modificarPalabraRecursiva(palabras, palabraAntigua, scanner, 0);
    }

    private static void modificarPalabraRecursiva(String[] palabras, String palabraAntigua, Scanner scanner, int indice) {
        if (indice >= palabras.length) {
            System.out.println("La palabra no fue encontrada.");
            return;
        }
        if (palabras[indice].equalsIgnoreCase(palabraAntigua)) {
            System.out.print("Ingrese la nueva palabra: ");
            String palabraNueva = scanner.nextLine();
            palabras[indice] = palabraNueva;
            oracion = String.join(" ", palabras);
            System.out.println("Oración modificada: " + oracion);
        } else {
            modificarPalabraRecursiva(palabras, palabraAntigua, scanner, indice + 1);
        }
    }

    private static void agregarContenido(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oracion += " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    } 
}
