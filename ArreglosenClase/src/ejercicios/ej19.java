package ejercicios;

import java.io.IOException;

public class ej19{
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese un texto (presione Ctrl+D para finalizar):");

        int[] contadorPalabras = new int[6]; // Array para contar palabras de 1, 2, 3, 4, 5 y más de 5 caracteres
        int longitudPalabra = 0;
        int estado = 0; // 0: fuera de una palabra, 1: dentro de una palabra

        int c;
        while ((c = System.in.read()) != -1) {
            char caracter = (char) c;

            // Verificar si el caracter es un espacio en blanco o un salto de línea
            if (caracter == ' ' || caracter == '\n' || caracter == '\r') {
                if (estado == 1) {
                    // Si estaba dentro de una palabra, incrementar el contador correspondiente
                    if (longitudPalabra <= 5) {
                        contadorPalabras[longitudPalabra - 1]++;
                    } else {
                        contadorPalabras[5]++;
                    }
                }
                estado = 0; // Estamos fuera de una palabra
                longitudPalabra = 0; // Reiniciar la longitud de la palabra
            } else {
                // Estamos dentro de una palabra
                estado = 1;
                longitudPalabra++;
            }
        }

        // Imprimir los resultados
        System.out.println("Resultados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Palabras de " + (i + 1) + " letra(s): " + contadorPalabras[i]);
        }
        System.out.println("Palabras de 6 o más letras: " + contadorPalabras[5]);
    }
}


