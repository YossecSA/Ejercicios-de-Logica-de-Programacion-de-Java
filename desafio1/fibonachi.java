package desafio1;

public class fibonachi {
    public static void main(String[] args) {
        int cantidad = 8; 
        int a = 0, b = 1;

        System.out.println("Los primeros " + cantidad + " términos de la serie de Fibonacci:");

        int contador = 0;
        while (contador < cantidad) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }

    }
}
