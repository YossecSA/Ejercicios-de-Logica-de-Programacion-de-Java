package desafio5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;

        try {
            String oracion = "";
            while (condicion) {         
                showMenu(oracion);       
                System.out.print("Seleccione una opción: ");
                String opcion = sc.nextLine();

                switch (opcion) {
                    case "0":
                        System.out.println("Saliendo del programa...");
                        condicion = false;
                        break;

                    case "1":
                        System.out.print("Ingrese la nueva oración: ");
                        oracion = sc.nextLine();
                        break;

                    case "2":
                        oracion = "";
                        System.out.println("Oración borrada.");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

                while (!oracion.isEmpty()) {
                    menuOracion(oracion, sc);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }

    public static void showMenu(String oracion) {
        if (oracion.isEmpty()) {
            System.out.println("1. Crear oración");
        } else {
            System.out.println("2. Borrar oración");
        }
        System.out.println("0. Salir");
    }

    public static void menuOracion(String oracion, Scanner sc){
        System.out.println("================================");
        System.out.println("Menu Oracion ");
        System.out.println("1) Cantidad de caracteres de la oración");
        System.out.println("2) Cantidad de palabras de la oración");
        System.out.println("3) Mostrar palabras ordenadas alfabéticamente");
        System.out.println("4) Ingresar un número y devolver la palabra correspondiente");
        System.out.println("5) Buscar palabra dentro de la oración");
        System.out.println("6) Modificar palabra dentro de la oración");
        System.out.println("7) Agregar contenido a la oración");
        System.out.println("0) Volver al menú principal");
        System.out.print("Seleccione una opcion: ");
        String opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("La cantidad de caracteres es: " + cantidadCaracteres(oracion));
                break;
            case "2":
                System.out.println("La cantidad de palabras de la oración es: " + cantidadPalabras(oracion));
                break;
            case "3":
                System.out.println("Las palabras ordenas son: ");
                System.out.println(palabrasOrdenads(oracion));
            case "4":
                System.out.println("La posicion de la palabra es " + posicionPalabra(oracion, sc));
                break;
            case "5":
                System.out.println("===============================");
                buscarPalabra(oracion, sc);
                break;
            case "6":
                System.out.println("===============================");
                String oracionModificada = modificarPalabra(oracion, sc);
                System.out.println("Oración modificada: " + oracionModificada);
                break;
            case "7":
                String nuevaOracion = agregarContenido(oracion, sc);
                System.out.println("Oración modificada: " + nuevaOracion);
                break;
            case "0":
                return;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    
    public static int cantidadCaracteres(String oracion) {
        return oracion.length();
    }

    public static int cantidadPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }

    public static String palabrasOrdenads(String oracion){
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        String palabrasOrden ="";
        for (String string : palabras) {
            palabrasOrden += "-> " + string + "\n";
        }
        return palabrasOrden;
    }
    public static String posicionPalabra(String oracion, Scanner sc){

        String[] palabras = oracion.split("\\s+");

        System.out.print("Ingrese un número: ");
        int posicion = sc.nextInt();
        sc.nextLine(); 

        if (posicion < 1 || posicion > palabras.length) {
            return "Número inválido. Intente nuevamente";
        } else {
            return palabras[posicion - 1];
        }
    }
    public static String buscarPalabra(String oracion, Scanner sc) {
        String[] palabras = oracion.split("\\s+");
        System.out.print("Ingrese una palabra, para buscar en la oracion: ");
        String palabraBuscada = sc.nextLine();

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscada)) {
                return "Palabra encontrada en la posición: " + (i + 1);
            }
        }

        return "Palabra no encontrada.";
    }

    public static String modificarPalabra(String oracion, Scanner sc) {
        String[] palabras = oracion.split("\\s+");
        String palabraOriginal = "";
        boolean palabraEncontrada = false;

        while (!palabraEncontrada) {
            System.out.print("Ingrese la palabra que desea cambiar: ");
            palabraOriginal = sc.nextLine();

            for (String palabra : palabras) {
                if (palabra.equalsIgnoreCase(palabraOriginal)) {
                    palabraEncontrada = true;
                    break;
                }
            }

            if (!palabraEncontrada) {
                System.out.println("Palabra no encontrada. Intente nuevamente.");
            }
        }

        String nuevaPalabra = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingrese la nueva palabra o frase: ");
            nuevaPalabra = sc.nextLine();

            if (nuevaPalabra.matches("[a-zA-Z\\s]+")) {
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Solo se permiten letras y espacios.");
            }
        }

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraOriginal)) {
                palabras[i] = nuevaPalabra;
            }
        }
        return String.join(" ", palabras);
    }
    public static String agregarContenido(String oracion, Scanner sc) {
        System.out.print("Ingrese el contenido que desea agregar a la oración: ");
        String contenido = sc.nextLine();

        while (!contenido.matches("[a-zA-Z\\s]+")) {
            System.out.println("Entrada inválida. Solo se permiten letras y espacios.");
            System.out.print("Ingrese el contenido que desea agregar a la oración: ");
            contenido = sc.nextLine();
        }

        return oracion + " " + contenido;
    }

}
