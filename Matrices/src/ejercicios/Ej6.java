package ejercicios;

import java.util.Scanner;

public class Ej6 {
    /*
    Crear una matriz de nxm filas, intercambiar la primera fila con la segunda, imprimir luego la matriz
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
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
        int aux;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i==0){
                    aux= matriz[i][j];
                    matriz[i][j]=matriz[i+1][j];
                    matriz[i+1][j]=aux;
                }
            }
            }
        System.out.println("ARREGLO INTERCALADO");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }
    }
}
