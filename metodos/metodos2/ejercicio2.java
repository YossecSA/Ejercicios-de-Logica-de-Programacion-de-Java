package metodos.metodos2;

import java.util.Scanner;

public class ejercicio2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double numero1 = solicitarNumero("Ingresa el primer número: ");
        double numero2 = solicitarNumero("Ingresa el segundo número: ");

        while (true) {
            int opcion = menu();

            if (opcion == 5) {
                System.out.println("Saliendo ...");
                break;
            } else if (opcion == 0) {
                System.out.println("Intente nuevamente");
            } else {
                realizarOperacion(opcion, numero1, numero2);
            }
        }
    }
    // Calculadora: Vuelve a realizar el ejercicio de la calculadora, pero esta vez
    // crea un método llamado "menu()" que no reciba ningún parámetro y se encargue
    // de generar la lógica de mostrar el menú de opciones y producir el bucle para
    // seguir mostrando el menú hasta seleccionar la opción de "salir". Solicita dos
    // números al usuario y realiza la operación matemática seleccionada, teniendo
    // en cuenta las validaciones necesarias como la división por cero.

    public static Double solicitarNumero(String posicionNumero) {
        while (true) {
            System.out.println("Por favor ingrese el " + posicionNumero + " :");
            try {
                return sc.nextDouble();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");

            }
        }
    }

    public static int menu() {

        try {
            System.out.println(" ---------- Menu -------------");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opcion: ");
            return sc.nextInt();

        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Opcion Invalida, intente nuevamente: 2");
            return 0;
        }
    }

    public static void realizarOperacion(int opcion, double numero1, double numero2) {
        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    operacionValida = false;
                }
                break;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }
    }
}
