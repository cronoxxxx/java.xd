package ejercicios;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[][]matriz=new int[3][4];
        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
                matriz[i][j]= entrada.nextInt();
            }
        }
        System.out.println("ARREGLO ORIGINAL");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }
        System.out.println("LA PRIMERA FILA ES: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++) {
                if (i==0){
                    System.out.print(matriz[i][j]+" ");
                }
            }
            }
        System.out.println("\nLA ULTIMA FILA ES: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++) {
                if (i==2){
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }
        System.out.println("\nLA PRIMERA COLUMNA ES: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++) {
                if (j==0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
