package ejercicios;

import java.io.IOException;

/*
Entrar una serie de caracteres en una tabla, y mirar si esta es un “palíndromo” o no lo es.
Un palíndromo son aquellas palabras que se leen igual de izquierda a derecha que de derecha a izquierda, por ejemplo ALLA.
 */
public class ej16 {
    public static void main(String[] args) throws IOException {
        char[]palindromos=new char[50];
        System.out.println("GUARDANDO PALINDROMOS...");
        int i;
        for (i=0; i < palindromos.length && palindromos[i]!=10;i++){
            char c = (char) System.in.read();
            if (c == '\n') {
                break; // Salir del bucle al encontrar un salto de línea
            }
            palindromos[i] = c;
        }
        for (int j = 0; j < i && palindromos[j] != 10 && palindromos[j] != 0; j++) {
            System.out.print(palindromos[j]);
        }
        boolean esPalindromo = true;
        for (int j = 0; j < i/2; j++) {
            if (palindromos[j] != palindromos[i - 1 - j]) {
                esPalindromo = false;
                break; // Salir del bucle si se encuentra una discrepancia
            }
        }

        // Imprimir el resultado
        if (esPalindromo) {
            System.out.println("\nES UNA PALABRA PALINDROMA");
        } else {
            System.out.println("\nNO ES UNA PALABRA PALINDROMA");
        }
        }
    }

