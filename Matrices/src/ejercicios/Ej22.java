package ejercicios;

import java.util.Scanner;

/*
Trasponer una matriz
 */
public class Ej22 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas= entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas= entrada.nextInt();
        int[][]matriz=new int[filas][columnas];
        System.out.println("GUARDANDO NUMEROS...");
        for(int i=0;i<filas; i++){
        for(int j=0; j<columnas; j ++){
            System.out.println("Matriz ["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]= entrada.nextInt();
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for(int i=0;i<filas; i++){
            for(int j=0; j<columnas; j ++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        int aux;
        for(int i=0;i<filas; i++){
            for(int j=0; j<i; j ++) {
                    aux=matriz[i][j];
                    matriz[i][j]=matriz[j][i];
                    matriz[j][i]=aux;
                }
            }
        System.out.println("MATRIZ TRASPUESTA");
        for(int i=0;i<filas; i++){
            for(int j=0; j<columnas; j ++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
            }

    }


