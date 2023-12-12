package ejercicios;

import java.util.Scanner;

public class Ej4 {
    /*
    Crear una matriz de nxm filas (cargar n y m por teclado) Imprimir el mayor elemento y la fila y columna donde se almacena
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = entrada.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maximo = matriz[0][0];
        int filaMaximo = 0;
        int columnaMaximo = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMaximo = i;
                    columnaMaximo = j;
                }
            }
        }

        System.out.println("El mayor elemento es " + maximo + " y se encuentra en la fila " + (filaMaximo + 1) + " y columna " + (columnaMaximo + 1));
    }
}
