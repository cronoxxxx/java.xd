package ejercicios;

import java.util.Scanner;

public class Ej16MathRandom {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas=entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas=entrada.nextInt();
        int[][]matriz= new int[filas][columnas];
        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            matriz[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
