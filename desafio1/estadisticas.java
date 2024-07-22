package desafio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class estadisticas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de notas: ");
        int cantidad = sc.nextInt();

        String[] notasAleatorias = new String[cantidad];

        for (int i = 0; i < notasAleatorias.length; i++) {
            notasAleatorias[i] = String.valueOf(random.nextInt(10));
        }

        Double[] desaprobados = new Double[cantidad];
        Double[] aprobados = new Double[cantidad];
        Double[] excelentes = new Double[cantidad];

        double promedioGeneral = 0.0;

        int contadorDesaprobados = 0, contadorAprobados = 0, contadorExcelentes = 0;

        for (int i = 0; i < cantidad; i++) {
            Double nota = Double.parseDouble(notasAleatorias[i]);
            promedioGeneral += nota;

            if (nota < 4) {
                desaprobados[contadorDesaprobados++] = nota;
            } else if (nota >= 4 && nota < 9) {
                aprobados[contadorAprobados++] = nota;
            } else if (nota >= 10) {
                excelentes[contadorExcelentes++] = nota;
            }
        }

        // Calcular promedios
        promedioGeneral /= cantidad;
        String promedioDesaprobado = calcularPromedio(desaprobados, contadorDesaprobados);
        String promedioAprobado = calcularPromedio(aprobados, contadorAprobados);
        String promedioExcelente = calcularPromedio(excelentes, contadorExcelentes);

        // Mostrar resultados
        System.out.println("Lista de notas generadas aleatoriamente: " + Arrays.toString(notasAleatorias));
        System.out.println("Promedio de todas las notas: " + promedioGeneral);
        System.out.println("===============================");
        System.out.println(
                "Lista de notas desaprobadas: " + Arrays.toString(Arrays.copyOf(desaprobados, contadorDesaprobados)));
        System.out.println("Promedio de notas desaprobadas: " + promedioDesaprobado);
        System.out.println("===============================");
        System.out.println("Lista de notas aprobadas: " + Arrays.toString(Arrays.copyOf(aprobados, contadorAprobados)));
        System.out.println("Promedio de notas aprobadas: " + promedioAprobado);
        System.out.println("===============================");
        System.out.println(
                "Lista de notas excelentes: " + Arrays.toString(Arrays.copyOf(excelentes, contadorExcelentes)));
        System.out.println("Promedio de notas excelentes: " + promedioExcelente);

        sc.close();
    }

    private static String calcularPromedio(Double[] arreglo, int cantidadElementos) {
        if (cantidadElementos == 0) {
            return "0.0";
        }

        double suma = 0.0;
        for (int i = 0; i < cantidadElementos; i++) {
            suma += arreglo[i];
        }
        double promedio = suma / cantidadElementos;

        return String.format("%.3f", promedio);
    }
}
