package ejercicios;

import java.util.Scanner;

/*
Imprimir columnas primera de una matriz2x5, luego imprimir el arreglo
 */
public class Ej13 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[][]matriz= new int[2][5];
        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Matriz[" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("LA PRIMERA COLUMNA ES");
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==0){
                    System.out.println(matriz[i][j]);
                }
            }
            }
        System.out.println("LA SEGUNDA COLUMNA ES");
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==1){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        System.out.println("LA TERCERA COLUMNA ES");
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==2){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        System.out.println("LA CUARTA COLUMNA ES");
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==3){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        System.out.println("LA QUINTA COLUMNA ES");
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==4){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        System.out.println("ARREGLO TOTAL");
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }
    }
}
