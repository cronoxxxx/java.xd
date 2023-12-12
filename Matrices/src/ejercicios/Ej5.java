package ejercicios;

import java.util.Scanner;

public class Ej5 {
    /*
    Crear una matriz de nxm filas (cargar n y m por teclado) Imprimir el mayor y menor elemento de la matriz y la fila y columna donde se almacena
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas;
        int columnas;

        do {
            System.out.println("Ingrese el numero de filas");
            filas = entrada.nextInt();
            System.out.println("Ingrese el numero de columnas");
            columnas = entrada.nextInt();
        } while (filas<0 ||columnas<0);

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz[" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = entrada.nextInt();

            }
        }
        System.out.println("ARREGLO ORIGINAL");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //MAXIMO

        int maximo = matriz[0][0];
        int minimo = matriz[0][0];
        int posfila = 0;
        int poscolumna = 0;
        int posfilamenor = 0;
        int poscolumnamenor = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    posfila = i;
                    poscolumna = j;
                }
            }
        }


        //MINIMO
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                    posfilamenor = i;
                    poscolumnamenor = j;
                }
            }
        }
        System.out.println("LA POSICION MÁXIMA ES: "+maximo+" en la matriz["+(posfila+1)+"]["+(poscolumna+1)+"]");
        System.out.println("LA POSICION MINIMA ES: "+minimo+" en la matriz["+(posfilamenor+1)+"]["+(poscolumnamenor+1)+"]");
    }
}
