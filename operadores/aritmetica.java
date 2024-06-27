package operadores;

public class aritmetica {
    public static void main(String[] args) {

        // suma
        int a = 5;
        int b = 3;
        int suma = a + b; // 8

        // resta
        int resta = a - b; // 2

        // multiplicacion
        int multiplicacion = a * b; // 15

        // division
        int division = a / b; // 1 (división entera)
        double divisionReal = (double) a / b; // 1.666...

        // modulo - resto de una division
        int modulo = a % b; // 2

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(divisionReal);
        System.out.println(modulo);
    }
}
