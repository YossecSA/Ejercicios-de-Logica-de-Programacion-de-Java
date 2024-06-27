package operadores;

public class logica {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        boolean esMenorOIgual = (a <= b); // false
        boolean resultadoOR = (a > b || b < 0); // true
        boolean resultadoNOT = !(a > b); // false

        System.out.println(esMenorOIgual);
        System.out.println(resultadoOR);
        System.out.println(resultadoNOT);
    }
}
