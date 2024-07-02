package estructuracontrol.switchteoria;

import java.util.Scanner;

public class opcion {
    public static void main(String[] args) {
        // En esta actividad, vas a desarrollar un programa que mostrará un menú con las
        // siguientes opciones:

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido :");
        System.out.println("1) Guardar:");
        System.out.println("2) Cargar:");
        System.out.println("3) Salir:");
        System.out.print("Seleccione una opcion: ");
        Integer opcion = sc.nextInt();

        String mensaje = switch (opcion) {

            case 1 -> "Se guardo correctamente";
            case 2 -> "cargando ...";
            case 3 -> "Vuelva pronto";
            default -> "Opcion invalida";
        };

        System.out.println(mensaje);

        sc.close();
    }
}
