package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej23modified {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int[] arreglo = new int[6];
        int i, j = 0;

        for (i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100);
        }

        // METODO BURBUJA XD
        int aux;
        boolean bandera = false;
        for (i = 0; i < arreglo.length - 1; i++) {
            do {
                for (j = 0; j < arreglo.length - 1; j++) {
                    bandera = false;
                    if (arreglo[j] > arreglo[j + 1]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        bandera = true;
                    }
                }
            } while (bandera);
        }

        // CREAR JUEGO
        boolean juegoActivo = true;
        int[] numerosIngresados = new int[arreglo.length]; // Almacena los números que el usuario ha ingresado

        while (juegoActivo) {
            // ARRAY ORDENADO
            // USUARIO XD
            System.out.println("Intenta adivinar el número:");
            int numero = entrada.nextInt();

            // Verificar si el número ya ha sido ingresado
            boolean yaInsertado = false;
            for (int k = 0; k < numerosIngresados.length; k++) {
                if (numerosIngresados[k] == numero) {
                    yaInsertado = true;
                    break;
                }
            }

            if (yaInsertado) {
                System.out.println("Este número ya lo ingresaste. ¡Intenta con otro!");
            } else {
                numerosIngresados[j] = numero; // Agregar el número a la lista de ingresados

                boolean encontrado = false;
                for (int k = 0; k < arreglo.length; k++) {
                    if (arreglo[k] == numero) {
                        encontrado = true;
                        break;
                    }
                }

                // UNA MUESTRA
                if (encontrado) {
                    System.out.println("¡FELICIDADES! Has adivinado el número en la posición " + (i + 1));
                    juegoActivo = false; // End the game
                    System.out.println("Array:");
                    for (i = 0; i < arreglo.length; i++) {
                        System.out.print(arreglo[i] + " ");
                    }
                } else {
                    System.out.println("No has adivinado. ¡Intenta de nuevo!");
                }
            }
        }
    }
}



