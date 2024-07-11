package bucles.bucleforreach;

import java.util.Arrays;
import java.util.Random;

public class ejercicio {
    public static void main(String[] args) {
        // ejercicio1();
        //ejercicio2();
        ejercicio3();

    }
    // Escribe un programa que genere un array de 10 elementos de tipo entero.
    // Inicializa cada elemento con un número aleatorio menor a 100 y luego imprime
    // todos los elementos del array en una única línea. Posteriormente, recorre el
    // array para contar los elementos pares y muestra el total en la consola.

    public static void ejercicio1() {

        int[] numeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }
        System.out.println("Array: " + Arrays.toString(numeros));

        int countPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                countPares++;
            }
        }

        // Muestra el total de elementos pares en la consola
        System.out.println("Total de elementos pares: " + countPares);
    }

    public static void ejercicio2() {

        float[] numeros = {
                12.5f, 7.3f, 9.1f, 4.8f, 5.6f, 3.2f, 8.7f, 6.4f, 10.2f, 15.9f,
                11.5f, 14.6f, 13.3f, 6.8f, 9.9f, 4.1f, 7.5f, 8.2f, 12.4f, 10.0f
        };

        float suma = 0;

        for (float numero : numeros) {
            suma += numero;
        }

        float promedio = suma / numeros.length;

        System.out.println("Suma de los elementos: " + suma + " cantidad de elementos: " + numeros.length);
        System.out.println("Promedio de los elementos: " + promedio);
    }

    // Crea un array del tamaño que prefieras que contenga elementos de tipo cadena.
    // Luego, concatena los elementos en una sola cadena, separados por espacios, e
    // imprime el resultado por consola.
    public static void ejercicio3() {
        String[] palabras = {
                "Hola", "mundo", "desde", "Java", "concatenación", "de", "cadenas"
        };
        String texto = "";
        for (String string : palabras) {
            texto += string + " ";
        }
        System.out.println(texto);
    }
}
