package desafio6;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] listaAlumnos = new String[2];
        Double[] listaNotas = new Double[2];
        int contador = 0;

        try {
            boolean salir = false;

            while (!salir) {
                System.out.println("===========================");
                System.out.println("1) Registrar Alumno");
                System.out.println("2) Mostrar todos los Alumnos");
                System.out.println("3) Mostrar Promedio de Notas");
                System.out.println("4) Buscar alumno por nombre");
                System.out.println("5) Modificar nota por nombre");
                System.out.println("6) Eliminar alumno por nombre");
                System.out.println("7) Salir");
                System.out.print("Seleccione una opcion: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        if (contador < listaAlumnos.length) {
                            registroAlumno(sc, listaAlumnos, listaNotas, contador);
                            contador++;
                        } else {
                            System.out.println("No se pueden registrar más alumnos.");
                        }
                        break;

                    case 2:
                        listarAlumnos(sc, listaAlumnos, listaNotas, contador);
                        break;
                    case 3:
                        System.out.println("El promedio de las notas es: " + promedioNotas(listaNotas, contador));
                        break;
                    case 4:
                        System.out.println(buscarAlumno(sc, listaAlumnos, listaNotas, contador));
                        break;
                    case 5:
                        modificarNota(sc, listaAlumnos, listaNotas, contador);
                        break;
                    case 6:
                        eliminarAlumno(sc, listaAlumnos, listaNotas, contador);
                        contador--;
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void registroAlumno(Scanner sc, String[] listaAlumnos, Double[] listaNotas, int contador) {
        System.out.println("===============================");
        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = sc.nextLine();

        while (nombreAlumno.isEmpty()) {
            System.out.print("El nombre no puede estar vacío, ingrese nuevamente: ");
            nombreAlumno = sc.nextLine();
        }

        System.out.print("Ingrese la nota del alumno: ");
        Double notaAlumno = sc.nextDouble();

        while (notaAlumno < 0.00 || notaAlumno > 10.00) {
            System.out.print("La nota debe estar entre 0.00 y 10.00, ingrese nuevamente: ");
            notaAlumno = sc.nextDouble();
        }

        sc.nextLine();

        listaAlumnos[contador] = nombreAlumno;
        listaNotas[contador] = notaAlumno;
    }

    public static void listarAlumnos(Scanner sc, String[] listaAlumnos, Double[] listaNotas, int contador) {
        System.out.println("===============================");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ") Nombre: " + listaAlumnos[i] + " Nota: " + listaNotas[i]);
        }
    }

    public static Double promedioNotas(Double[] listaNotas, int contador) {
        System.out.println("===============================");
        double suma = 0.0;

        for (int i = 0; i < contador; i++) {
            suma += listaNotas[i];
        }

        return suma / contador;
    }

    public static String buscarAlumno(Scanner sc, String[] listaAlumnos, Double[] listaNotas, int contador) {
        System.out.println("==========================");
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreAlumno = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            if (listaAlumnos[i].equalsIgnoreCase(nombreAlumno)) {
                return "La nota del alumno " + listaAlumnos[i] + " es: " + listaNotas[i];
            }
        }

        return "El alumno no existe.";
    }

    public static void modificarNota(Scanner sc, String[] listaAlumnos, Double[] listaNotas, int contador) {
        System.out.println("==========================");
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreAlumno = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            if (listaAlumnos[i].equalsIgnoreCase(nombreAlumno)) {
                System.out.print("Ingrese la nueva nota: ");
                Double nuevaNota = sc.nextDouble();

                while (nuevaNota < 0.00 || nuevaNota > 10.00) {
                    System.out.print("La nota debe estar entre 0.00 y 10.00, ingrese nuevamente: ");
                    nuevaNota = sc.nextDouble();
                }

                sc.nextLine();

                listaNotas[i] = nuevaNota;
                System.out.println("La nueva nota del alumno " + listaAlumnos[i] + " es: " + listaNotas[i]);
                return;
            }
        }

        System.out.println("El alumno no existe.");
    }

    public static void eliminarAlumno(Scanner sc, String[] listaAlumnos, Double[] listaNotas, int contador) {
        System.out.println("==========================");
        System.out.println("========= Eliminar Alumno =========");
        System.out.print("Ingrese el nombre a eliminar: ");
        String nombreAlumno = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            if (listaAlumnos[i].equalsIgnoreCase(nombreAlumno)) {
                System.out.print("¿Está seguro de eliminar al alumno? (si/no): ");
                String confirmar = sc.nextLine();

                if (confirmar.equalsIgnoreCase("si")) {
                    for (int j = i; j < contador - 1; j++) {
                        listaAlumnos[j] = listaAlumnos[j + 1];
                        listaNotas[j] = listaNotas[j + 1];
                    }
                    listaAlumnos[contador - 1] = null;
                    listaNotas[contador - 1] = null;
                    System.out.println("Alumno eliminado correctamente.");
                    return;
                } else {
                    System.out.println("Operación cancelada.");
                    return;
                }
            }
        }

        System.out.println("El alumno no existe.");
    }
}
