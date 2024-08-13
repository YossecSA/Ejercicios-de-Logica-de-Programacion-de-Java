package metodos.metodos2;

public class ejercicio4 {
    public static void main(String[] args) {

        System.out.println("El numero random generado es: " + numeroAleatorio());
    }
    // Ejercicio anterior: “Generando números aleatorios” Escribe un programa que
    // genere y muestre en pantalla un número aleatorio en el rango del 1 al 355
    // utilizando el método random() de la clase Math. Puedes utilizar el método
    // floor() para redondear el número aleatorio hacia abajo.

    public static int numeroAleatorio() {
        double randomDouble = Math.random();
        return (int) Math.floor(randomDouble * 355) + 1;
    }
}
