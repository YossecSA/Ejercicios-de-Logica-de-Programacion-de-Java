package estructuracontrol.complementario;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // En este ejercicio, desarrollarás un programa que solicitará al usuario el
        // precio de un producto y determinará si tiene derecho a un descuento. Si el
        // precio es igual o mayor a $100, se aplicará un descuento del 10% y se
        // mostrará el nuevo precio con descuento. De lo contrario, se mostrará el
        // precio original sin descuento.

        System.out.println("Ingrese el precio: ");
        Double precio = sc.nextDouble();

        Double descuento = 0.0;

        if (precio >= 100) {
            descuento = 0.10; // 10%
        }

        Double precioNuevo = precio - (precio * descuento);

        System.out.println("El precio es: " + precioNuevo);

        sc.close();
    }
}
