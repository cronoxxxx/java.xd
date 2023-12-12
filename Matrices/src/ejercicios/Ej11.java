package ejercicios;

import java.util.Scanner;

public class Ej11 {
    /*
    Imprimir los elementos del medio de una matriz 4x4
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[][]matriz=new int[4][4];
        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]= entrada.nextInt();
            }
        }
        System.out.println("\nARREGLO ORIGINAL");
        System.out.println("\n");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nLOS ELEMENTOS DEL MEDIO SON:");

        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==1 || i==2){
                    if (j==1 || j==2){
                        System.out.print(matriz[i][j]+" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
