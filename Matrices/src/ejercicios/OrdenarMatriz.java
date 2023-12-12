package ejercicios;

import java.util.Scanner;

public class OrdenarMatriz {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas=entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnnas");
        int columnas =entrada.nextInt();
        int[][] matriz= new int[filas][columnas];
        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]= entrada.nextInt();
            }
        }
        System.out.println("\n ARREGLO ORIGINAL");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        int aux;
        int minimo;
        for (int i=0; i<filas;i++){
            for (int j=0; j<columnas; j++){
                minimo=j;
                for (int k=j+1; k<columnas; k++){
                    if (matriz[i][minimo]>matriz[i][k]){
                        minimo=k;
                    }
                }
                aux=matriz[i][j];
                matriz[i][j]=matriz[i][minimo];
                matriz[i][minimo]=aux;

            }
        }
        System.out.println("\n ARREGLO ORDENADO");
        for (int i=0; i<filas;i++){
            for (int j=0; j<columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }
    }

}
