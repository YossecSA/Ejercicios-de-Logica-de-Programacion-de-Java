package desafios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.print("Ingresa el primer valor: ");
            double valor1 = sc.nextDouble();
            
            System.out.print("Ingresa el segundo valor: ");
            double valor2 = sc.nextDouble();
            
            System.out.print("Ingresa la operación: ");
            System.out.print("suma + ");
            System.out.print("resta - ");
            System.out.print("multiplicacion * ");
            System.out.print("division / ");
            System.out.print("potencia ^ ");
            char operacion = sc.next().charAt(0);
            
            // Realizar la operación usando operador ternario
            double resultado = (operacion == '+') ? (valor1 + valor2)
                : (operacion == '-') ? (valor1 - valor2)
                : (operacion == '*') ? (valor1 * valor2)
                : (operacion == '/') ? (valor1 / valor2)
                : (operacion == '^') ? Math.pow(valor1, valor2) : Double.NaN; // Valor NaN en caso de operación no válida
            
            // Mostrar el resultado
            if (!Double.isNaN(resultado)) {
                System.out.println("El resultado es: " + resultado);
            } else {
                System.out.println("Operación no válida");
            }
            
        }
        sc.close();
    }
}
