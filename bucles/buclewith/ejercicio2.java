package bucles.buclewith;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // numeroRandom(sc);
        //contra(sc);
        numeroDigitos(sc);

        sc.close();
    }
    // Escribe un programa que te pida que ingreses un número entero y utilice un
    // bucle while para calcular la cantidad de dígitos de ese número. Por ejemplo,
    // el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0
    // tiene una cifra y también contar las cifras de números negativos.

    public static void numeroDigitos(Scanner sc) {
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        
        int contadorDigitos = 0;

        if (numero == 0) {
            contadorDigitos = 1;
        } else {

            int temp = numero;
            while (temp != 0) {
                temp /= 10;
                contadorDigitos++;
            }
        }

        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");

    }

    // Escribe un programa que solicite que ingreses una contraseña y la valide
    // utilizando un bucle while. La contraseña correcta es "secreto". Continuará
    // pidiéndote que ingreses la contraseña hasta que sea correcta.
    public static void contra(Scanner sc) {
        boolean condition = true;
        String password = "secreto";

        while (condition) {
            System.out.print("Ingrese su contraseña: ");
            String contra = sc.nextLine().toLowerCase();

            if (password.equals(contra)) {
                System.out.println("Contraseña correcta");
                condition = false;
            } else {
                System.out.println("Contraseña incorrecta");
            }

            System.out.println("=================================");

        }
    }

    // Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra
    // por consola un mensaje pidiéndote que adivines ese número utilizando un bucle
    // do-while. El programa te indicará si el número que ingresas es mayor o menor
    // que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas
    // correctamente.
    public static void numeroRandom(Scanner sc) {
        boolean control = true;

        // generador del numero random
        int resultado = (int) Math.floor(Math.random() * 20) + 1;

        do {
            System.out.print("Adivine el numero: ");
            int numero = sc.nextInt();

            if (resultado == numero) {
                System.out.println("Felicitaciones encontro el numero");
                control = false;
            } else if (resultado > numero) {
                System.out.println("El numero es mayor");
            } else if (resultado < numero) {
                System.out.println("El numero es menor");
            }

        } while (control);
    }

}
