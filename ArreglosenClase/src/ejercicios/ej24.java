package ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
Diseñar y codificar el algoritmo de ordenación de la burbuja empezando a recorrer el array desde la derecha.
 */
public class ej24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo:");
        int elementos = entrada.nextInt();
        Random random = new Random();
        int[] arreglo = new int[elementos];
        System.out.println("GUARDANDO EL FUCKING ARREGLO...");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100);
        }
        int aux;
        boolean esValido = false;
        for (int i = arreglo.length - 1; i > 0; i--) {
            do {
                for (int j = arreglo.length - 1; j > arreglo.length - 1 - i; j--) {
                    esValido = false;
                    if (arreglo[j] < arreglo[j - 1]) {
                        // Intercambiar elementos si están en el orden incorrecto
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j - 1];
                        arreglo[j - 1] = aux;
                        esValido = true;
                    }
                }
            } while (esValido);

        }
        for (int  i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
