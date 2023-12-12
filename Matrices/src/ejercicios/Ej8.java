package ejercicios;
/*
    Crear una matriz de nxm, imprimir los cuatros valores que se encuentran en los vertices
    de la misma
     */
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = entrada.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("GUARDANDO NUMEROS...");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz[" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nARREGLO: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("LOS VERTICES DE LA MATRIZ SON");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1) {
                            for ( j = 0; j < columnas; j++) {
                                if (j == 0 || j == columnas - 1) {
                                System.out.print(matriz[i][j]+" ");
                            }
                        }
                    System.out.println();
                    }
                }
            }
        }
    }
