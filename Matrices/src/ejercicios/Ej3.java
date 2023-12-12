package ejercicios;

import java.util.Scanner;

public class Ej3 {
    /*
    Crear una matriz de nxm filas (cargar n y m por teclado). Imprimir la matriz completa y la ultima
    fila, pero esta vez usando datos de tipo String
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas= entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas= entrada.nextInt();
        String[][]matriz= new String[filas][columnas];
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            System.out.println("Nombres en posicion de: Matriz ["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]= entrada.next();
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++) {
                if (i==filas-1){
                    System.out.println("La ultima fila es:");
                    for(j=0; j<columnas; j++) {
                        System.out.print(matriz[i][j]+" ");
                        }
                    }
                }
            }
            }
    }
