package wrappers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // verificando(sc);
        // conversion(sc);
        // cadena(sc);
        // contador(sc);
        // suma(sc);
        contadorDigitos(sc);
        sc.close();
    }
    // Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un
    // número decimal usando Double.valueOf(). Si la cadena no representa un número
    // válido, Double.valueOf() lanzará una excepción. Captura esta excepción y
    // muestra un mensaje al usuario indicando que la entrada no es un número
    // válido.

    public static void verificando(Scanner sc) {
        try {
            System.out.println("Introdusca una cadena de texto: ");
            String entrada = sc.nextLine();

            double conversion = Double.valueOf(entrada);

            System.out.println("La convercion es: " + conversion);

        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no se puede convertir en Double");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    // Escribe un programa que lea una cadena que represente un número entero como
    // entrada utilizando la clase Scanner. Luego, convierte la cadena en un número
    // entero utilizando la clase de envoltura Integer.

    public static void conversion(Scanner sc) {
        System.out.println("Introduce una cadena que represente un número entero:");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("El número entero es: " + number);

        } catch (NumberFormatException e) {
            System.out.println("La cadena introducida no es un número entero válido.");
        }
    }

    // Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada
    // carácter en la cadena y utiliza Character.isLetter() para verificar si todos
    // los caracteres son letras. Muestra un mensaje al usuario indicando si la
    // cadena contiene solo letras o no.

    public static void cadena(Scanner sc) {
        System.out.println("Introduce una cadena:");
        String input = sc.nextLine();

        boolean letras = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetter(c)) {
                letras = false;
                break;
            }
        }

        if (letras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }
    }

    // Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada
    // carácter en la cadena y utiliza Character.isWhitespace() para contar el
    // número de espacios en blanco en la cadena. Muestra el recuento al usuario.

    public static void contador(Scanner sc) {
        System.out.println("Ingrese una cadena de Texto: ");
        String cadena = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isWhitespace(c)) {
                contador++;
            }
        }
        System.out.println("El numero de espacios de la frase es: " + contador);

    }
    // Pídele al usuario que introduzca una cadena que represente un número entero y
    // luego otra cadena que represente un número decimal. Convierte cada cadena al
    // tipo de dato correspondiente utilizando los métodos valueOf, suma sus valores
    // e imprímelos por consola.

    public static void suma(Scanner sc) {
        System.out.println("Introduce una cadena que represente un número entero:");
        String intInput = sc.nextLine();

        System.out.println("Introduce una cadena que represente un número decimal:");
        String decimalInput = sc.nextLine();

        try {
            Integer intNumber = Integer.valueOf(intInput);
            Double decimalNumber = Double.valueOf(decimalInput);

            Double sum = intNumber + decimalNumber;

            System.out.println("La suma de los valores es: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Una de las cadenas introducidas no es un número válido.");
        }
    }
    // Pídele al usuario que introduzca un número. Convierte el número en una cadena
    // y luego utiliza un bucle y Character.isDigit() para contar el número de
    // dígitos en el número.

    public static void contadorDigitos(Scanner scanner) {

        try {
            System.out.println("Introduce un número:");
            int input = scanner.nextInt();

            String inpuString = Integer.toString(input);

            int digitCount = 0;

            for (int i = 0; i < inpuString.length(); i++) {
                char c = inpuString.charAt(i);
                if (Character.isDigit(c)) {
                    digitCount++;
                }
            }
            System.out.println("El número de dígitos en el número es: " + digitCount);

        } catch (InputMismatchException e) {

            System.out.println("El numero ingresado contiene letras");

        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        }

    }
}
