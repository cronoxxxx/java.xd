package ejercicios;

import java.util.Scanner;

/*
Crear una matriz de nxm filas (cargar n y m por teclado) Imprimir la matriz completa y la ultima columna y fila
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnnas");
        int columnas = entrada.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz[" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("MATRIZ COMPLETA");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == filas - 1) {
                    System.out.println("\nLa ultima fila es");
                    for (j = 0; j< columnas; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                }

            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j == columnas - 1) {
                    System.out.println("\nLa ultima columna es");
                    for (i = 0; i< filas; i++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                }

            }
        }

    }
}


