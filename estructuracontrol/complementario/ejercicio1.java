package estructuracontrol.complementario;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Verificar contraseña
        // En este ejercicio, escribirás un programa que pida al usuario una contraseña
        // y verificará si coincide con una contraseña predefinida. Si la contraseña
        // ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso
        // contrario, se mostrará un mensaje de "Acceso denegado".

        String contraPredeterminado = "CONTRA12345";
        String mensaje = "denegado";

        System.out.print("Ingrese su contraseña :");
        String contraIngresada = sc.nextLine();

        String conversor = contraIngresada.toUpperCase();

        if (contraPredeterminado.equals(conversor)) { //equals comp
            mensaje = "concedido";
        } else {
            mensaje = "denegado";
        }
        System.out.println("Acceso " + mensaje);
        sc.close();
    }
}

//Explicacion
// cadena = "hola";
// cadena2 = "hola";

// if(cadena == cadena2){ son dos objetos diferentes en la memoria, aunque tengan el mismo contenido.
//     falso
// }

// if(cadena.equals(cadena2)){ compara el contenido de las cadenas y ambas contienen "Hola".
//     true
// }