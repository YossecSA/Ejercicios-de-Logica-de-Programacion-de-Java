package estructuracontrol.switchteoria.complementario;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Implementando el uso de la estructura "switch expression", solicita al
        // usuario que elija entre una de las siguientes dos figuras geométricas:

        System.out.println("Ingrese un numero: ");
        System.out.println("1) Circulo: ");
        System.out.println("2) Rectangulo: ");
        System.out.print("Seleccione una opcion: ");
        Integer figura = sc.nextInt();

        if (figura == 1 || figura == 2) {
            System.out.println("¿Que desea calcular?");
            System.out.println("1) Area");
            System.out.println("2) Perimetro");
            System.out.print("Seleccione una opcion: ");
            Integer calculo = sc.nextInt();

            Double resultado = switch (figura) {
                case 1 -> {
                    System.out.println("Ingrese el radio del circulo: ");
                    double radio = sc.nextDouble();
                    yield switch (calculo) {
                        case 1 -> Math.PI * radio * radio; // Área
                        case 2 -> 2 * Math.PI * radio; // Perímetro
                        default -> null;
                    };
                }
                case 2 -> {
                    System.out.println("Ingrese la base del rectangulo: ");
                    double base = sc.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo: ");
                    double altura = sc.nextDouble();
                    yield switch (calculo) {
                        case 1 -> base * altura; // Área
                        case 2 -> 2 * (base + altura); // Perímetro
                        default -> null;
                    };
                }

                default -> null;

            };

            if (resultado == null) {
                System.out.println("Opcion invalida");
            } else {
                String tipoCalculo = (calculo == 1) ? "El area" : "El perimetro";
                String resultadoFormateado = String.format("%.3f", resultado);
                System.out.println(tipoCalculo + " de la figura es: " + resultadoFormateado);
            }

        } else {
            System.out.println("Opcion invalida");
        }

        sc.close();
    }
}
