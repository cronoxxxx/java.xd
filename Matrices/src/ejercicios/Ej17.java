package ejercicios;

import java.util.Scanner;


public class Ej17 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas=entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas=entrada.nextInt();
        char[][]matriz= new char[filas][columnas];
        char caracterAleatorio;
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                if (Math.random() < 0.5) {
                    caracterAleatorio = (char) Math.floor(Math.random() * 26 + 'a');
                } else {
                    caracterAleatorio = (char) Math.floor(Math.random() * 26 + 'A');
                }
                matriz[i][j] = caracterAleatorio;
            }
        }
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }
    }
}
