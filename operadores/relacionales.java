package operadores;

public class relacionales {

    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        // igual
        boolean esIgual = (a == b); // false

        // diferente
        boolean noEsIgual = (a != b); // true

        // mayor que
        boolean esMayor = (a > b); // true

        // menor que
        boolean esMenor = (a < b); // false

        // mayor o igual que
        boolean esMayorOIgual = (a >= b); // true

        // menor o igual que
        boolean esMenorOIgual = (a <= b); // false

        System.out.println(esIgual);
        System.out.println(noEsIgual);
        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esMayorOIgual);
        System.out.println(esMenorOIgual);
    }
}