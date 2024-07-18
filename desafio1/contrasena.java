package desafio1;

import java.util.Random;
import java.util.Scanner;

public class contrasena {
    public static void main(String[] args) {

        //Java ASCII Table
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese la longitud de la contraseña: ");
        int longitud = sc.nextInt();

        char[] password = new char[longitud];

        // banderas
        boolean mayuscula = false, minuscula = false, digito = false;

        while (!mayuscula || !minuscula || !digito) {
            for (int i = 0; i < longitud; i++) {
                int tipoCaracter = random.nextInt(3);

                switch (tipoCaracter) {
                    case 0:
                        password[i] = (char) (random.nextInt(26) + 65); // A-Z
                        mayuscula = true;
                        break;
                    case 1:
                        password[i] = (char) (random.nextInt(26) + 97); // a-z
                        minuscula = true;
                        break;
                    case 2:
                        password[i] = (char) (random.nextInt(10) + 48); // 0-9
                        digito = true;
                        break;
                }
            }
        }

        String contraseñaStr = new String(password);
        System.out.println("Contraseña generada: " + contraseñaStr);

        sc.close();
    }
}
