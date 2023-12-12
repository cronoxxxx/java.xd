package ejercicios;

import java.io.IOException;
/*
public static void main(String[] args) throws IOException {
todo aqui, nada de private static void
 */
public class ej25{

    public static void main(String[] args) throws IOException {
        System.out.print("Introduce una palabra: ");
        char[] palabra = new char[50]; // Tamaño máximo de la palabra
        int i = 0;
        char caracter;

        while (true) {
            caracter = (char) System.in.read();

            // Salir del bucle al encontrar un salto de línea o espacio
            if (caracter == '\n' || caracter == ' ') {
                break;
            }

            palabra[i] = caracter;
            i++;
        }

        // Ordenar la palabra alfabéticamente
        int n = i;
        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < n - j - 1; k++) {
                if (palabra[k] > palabra[k + 1]) {
                    // Intercambiar caracteres
                    char temp = palabra[k];
                    palabra[k] = palabra[k + 1];
                    palabra[k + 1] = temp;
                }
            }
        }

        // Imprimir el resultado
        System.out.print("Palabra ordenada: ");
        for (int m = 0; m < n; m++) {
            System.out.print(palabra[m]);
        }
    }
}

