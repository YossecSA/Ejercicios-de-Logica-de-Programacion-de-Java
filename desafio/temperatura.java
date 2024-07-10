package desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese la temperatura: ");
            double temperatura = sc.nextDouble();

            System.out.print("Ingrese la unidad de medida (C/F): ");
            char medida = Character.toUpperCase(sc.next().charAt(0));

            String grado = switch (medida) {
                case 'C' -> {
                    double respuesta = (temperatura - 32) * 5 / 9;
                    yield formatoNum(temperatura, '0') + " grados Fahrenheit equivale a "
                            + formatoNum(respuesta, '2')
                            + " Celsius";
                }
                case 'F' -> {
                    double respuesta = (temperatura * 9 / 5) + 32;
                    yield formatoNum(temperatura, '0') + " grados Celsius equivale a "
                            + formatoNum(respuesta, '2')
                            + " Fahrenheit";
                }
                default -> "Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.";
            };

            System.out.println(grado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");

        } catch (Exception e) {

            System.out.println("Error: " + e);

        } finally {
            sc.close();
        }
    }

    private static String formatoNum(Double valor, char decimales) {

        String formato = "%." + decimales + "f";
        return (valor == valor.intValue()) ? String.valueOf(valor.intValue()) : String.format(formato, valor);

    }
}
