package ejercicios;

import java.io.IOException;
import java.util.Scanner;
/*
Trasponer con chars
 */
public class Ej23 {
    public static void main(String[] args) throws IOException {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas= entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas= entrada.nextInt();
        char [][]matriz= new char[filas][columnas];
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            System.out.println("Matriz ["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]= (char) System.in.read();
            System.in.read();
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        char aux;
        for (int i=0; i<filas; i++){
            for (int j=0; j<i; j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        System.out.println("MATRIZ TRASPUESTA");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }
    }
}
