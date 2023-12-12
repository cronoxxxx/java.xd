package ejercicios;
/*
Crear una matriz de nxm, imprimir los cuatros valores que se encuentran en los vertices
    de la misma, pero con char
 */
import java.io.IOException;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = entrada.nextInt();
        char[][] matriz = new char[filas][columnas];

        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j] = (char) System.in.read();


            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }

        System.out.println("Los vertices de la matriz son:");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++) {
                if (i==0 || i==columnas-1){
                    for(j=0; j<columnas; j++) {
                        if (j==0 || j==columnas-1){
                            if (i==0 && j==0){
                                System.out.println("La parte superior izquierda de la matriz es:"+matriz[i][j]);
                            }
                            if (i==0 && j==columnas-1){
                                System.out.println("La parte superior derecha de la matriz es:"+matriz[i][j]);
                            }
                            if (i==filas-1 && j==0){
                                System.out.println("La parte inferior izquierda de la matriz es:"+matriz[i][j]);
                            }
                            if (i==filas-1 && j==columnas-1){
                                System.out.println("La parte inferior derecha de la matriz es:"+matriz[i][j]);
                            }
                    }
                    }
                }
            }
            }
    }
}
