package Practica.EJ16;

import java.util.Random;
import java.util.Scanner;

public class P2 {
    public int [][] eliminarPosicion(int[][]matriz){
        Scanner entrada= new Scanner(System.in);
        int numeroaSeleccionar;
        do {
            System.out.println("¿Que fila desea eliminar una posicion?");
            numeroaSeleccionar= entrada.nextInt();
        }while (numeroaSeleccionar<0 || numeroaSeleccionar>5 );
        for(int i=0; i< matriz.length;i++) {
            if (i == numeroaSeleccionar - 1) {
                for (int j = 0; j < matriz[i].length-1; j++) {
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            }
        }
        for(int i=0; i< matriz.length;i++){
            if (i==numeroaSeleccionar-1){
                boolean eliminado=false;
                do {
                    System.out.println("¿Qué numero desea eliminar?");
                    int nE= entrada.nextInt();
                    for(int j=0; j<matriz[i].length-1;j++){
                        if (matriz[i][j]==nE){
                            for (int k = j; k < matriz[i].length - 1; k++) {
                                matriz[i][k] = matriz[i][k + 1];
                            }
                            eliminado=true;
                            break;
                        }
                    }
                } while (!eliminado);
            }
        }
        for(int i=0; i<matriz.length;i++){
            if (i==numeroaSeleccionar-1) {
                for (int j = 0; j < matriz[i].length-2; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

        }
        return matriz;
    }
    public static void main(String[] args) {
        P2 o2= new P2();
        Random random= new Random();
        int[][]matriz= new int[5][5];
        for (int i=0; i< matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= random.nextInt(10)+1;
            }
        }
        o2.eliminarPosicion(matriz);
    }
}
