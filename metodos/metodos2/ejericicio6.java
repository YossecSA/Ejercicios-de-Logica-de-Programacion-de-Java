package metodos.metodos2;

import java.util.Random;
import java.util.Scanner;

public class ejericicio6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numeroSecreto = numeroAleatorio(1, 20);
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 20): ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
            }
        } while (intento != numeroSecreto);
    }
    public static int numeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
