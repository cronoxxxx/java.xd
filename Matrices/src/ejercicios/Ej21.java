package ejercicios;

import java.io.IOException;
import java.util.Scanner;

/*
    Crear una matriz de nxm, mostrar la suma de cada fila y columna de la matriz, pero con char
     */
public class Ej21 {
    public static void main(String[] args) throws IOException {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas= entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas= entrada.nextInt();
        char[][] matriz=new char[filas][columnas];
        int [] sumaFilas=new int[filas];
        int [] sumaColumnas= new int[columnas];
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            System.out.println("Matriz ["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]=(char) System.in.read();
            System.in.read();
            }
        }
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            }

        System.out.println("\nSUMA DE FILAS");
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas;j++){
                sumaFilas[i]+=matriz[i][j];
            }
            System.out.println("Fila "+(i+1)+": "+sumaFilas[i]);
        }
        System.out.println("SUMA DE COLUMNAS");
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas;j++){
                sumaColumnas[j]+=matriz[i][j];
            }
        }
        for (int j=0; j<columnas;j++){
            System.out.println("Columna "+(j+1)+": "+sumaColumnas[j]);
        }
    }
}
