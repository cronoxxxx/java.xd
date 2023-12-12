package ejercicios;

import java.io.IOException;

public class ej15sol2 {
    public static void main(String[] args) throws IOException {
        char[] letras = new char[50];
        System.out.println("Escribe");
        int i;
        for (i = 0; i < letras.length && letras[i] != 10; i++) {
            char c = (char) System.in.read();
            if (c == '\n') {
                break; // Salir del bucle al encontrar un salto de línea
            }
            letras[i] = c;
        }
        for (i = 0; i < letras.length && letras[i] != 10; i++) {
            if (letras[i] == 97 || letras[i] == 101 || letras[i] == 105 || letras[i] == 111 || letras[i] == 117 || letras[i] == 65 ||
                    letras[i] == 69 || letras[i] == 73 || letras[i] == 79 || letras[i] == 85) {
                letras[i] = 42;
            }
        }
        for (int j = 0; j < i && letras[j] != 10 && letras[j] != 0; j++) {
            System.out.print(letras[j]);
        }
    }


}
