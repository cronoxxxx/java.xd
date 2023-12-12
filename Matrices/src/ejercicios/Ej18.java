package ejercicios;

import java.util.Scanner;

/*
SUMAR, RESTAR, MULTIPLICAR Y DIVIDIR DOS MATRICES
 */
public class Ej18 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int filas= 3;
        int columnas= 3;
        int [][]matriz1 = new int[filas][columnas];
        int [][]matriz2 = new int[filas][columnas];
        int [][]matrizsuma = new int[filas][columnas];
        int [][]matrizresta = new int[filas][columnas];
        int [][]matrizmultipliacion = new int[filas][columnas];
        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            System.out.println("Matriz 1: ["+(i+1)+"]["+(j+1)+"]");
            matriz1[i][j]= entrada.nextInt();
            }
        }

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.println("Matriz 2: ["+(i+1)+"]["+(j+1)+"]");
                matriz2[i][j]= entrada.nextInt();
            }
        }
        System.out.println("MATRIZ 1");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MATRIZ 2");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<filas; i++){
            for (int j=0; j<columnas; j++){
                matrizsuma[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        System.out.println("MATRICES SUMADAS");
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(matrizsuma[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<filas; i++){
            for (int j=0; j<columnas; j++){
                matrizresta[i][j]=matriz1[i][j]-matriz2[i][j];
            }
        }
        System.out.println("\nMATRICES RESTADAS");
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(matrizresta[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<filas; i++){
            for (int j=0; j<columnas; j++){
                matrizmultipliacion[i][j]=matriz1[i][j]*matriz2[i][j];
            }
        }
        System.out.println("\nMATRICES MULTIPLICADAS");
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(matrizmultipliacion[i][j]+" ");
            }
            System.out.println();
        }
    }
}
