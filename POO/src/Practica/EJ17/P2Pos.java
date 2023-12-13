package Practica.EJ17;

import java.util.Random;
import java.util.Scanner;

public class P2Pos {
    public static void main(String[] args) {
        P2Pos o2= new P2Pos();
        Random random= new Random();
        int[][]matriz=new int[10][10];
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j]= random.nextInt(100)+1;
            }
        }
        for(int i=0; i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        o2.principio(matriz);
    }
    public int[][] principio(int[][]array){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Que linea desea averiguar?");
        int linea=entrada.nextInt();
        for (int i=0; i< array.length;i++){
            if (i==linea-1){
                System.out.println("¿Cuantos numeros desea eliminar?");
                int numerosEliminar=entrada.nextInt();
                for (int j = 0; j < numerosEliminar; j++) {
                    System.out.println("¿Que posicion desea eliminar?");
                    int posicionEliminar= entrada.nextInt();
                    int index=posicionEliminar-1;
                    if (index>=0 && index<array[i].length){
                        array[i][index]=0;
                    }

                }
                break;
            }
        }
        salida(array);
        return array;
    }
    public int [][] salida(int[][]array){
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                    if (array[i][j]!=0){
                        System.out.print(array[i][j]+" ");
                    }
            }
            System.out.println();
        }
        return array;
    }
}
