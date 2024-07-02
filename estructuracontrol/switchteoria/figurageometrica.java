package estructuracontrol.switchteoria;

import java.util.Scanner;

public class figurageometrica {
    public static void main(String[] args) {
        // Mediante una estructura switch, desarrollarás un programa que pida al usuario
        // ingresar un número del 1 al 3 para seleccionar una figura geométrica: 1 para
        // círculo, 2 para cuadrado y 3 para triángulo. Después, solicitará al usuario
        // los datos necesarios para calcular el área de la figura seleccionada. Estos
        // datos serán:

        Scanner sc = new Scanner(System.in);

        System.out.println("Figura geometrica: ");
        System.out.println("1) Circulo: ");
        System.out.println("2) Cuadrado: ");
        System.out.println("3) Triangulo: ");
        System.out.print("Seleccione una opcion: ");
        Integer opcion = sc.nextInt();

        Double respuesta = switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                yield radio * radio * Math.PI;
            }
            case 2 -> {
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                yield lado * lado;
            }
            case 3 -> {
                System.out.print("Ingrese la base del triangulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura del triangulo: ");
                double altura = sc.nextDouble();
                yield (base * altura) / 2;
            }
            default -> null;
        };

        if (respuesta != null) {
            String resultadoFormateado = String.format("%.3f", respuesta);
            System.out.println("El area de la figura es: " + resultadoFormateado);
        } else {
            System.out.print("Opcion invalida");
        }
        sc.close();

    }
}
