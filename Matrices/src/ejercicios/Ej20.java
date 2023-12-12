package ejercicios;

import java.util.Scanner;

public class Ej20 {
    /*
    Crear una matriz de nxm, mostrar la suma de cada fila y columna de la matriz
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = entrada.nextInt();
        int[][] matriz = new int[filas][columnas];
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz[" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }
        for (int j = 0; j < columnas; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumaColumnas[j]);
        }
    }
    }

