package Practica.EJ17;

import java.util.Random;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Random random= new Random();
        int [][] matriz = new int[10][10];
        boolean [][]asignados= new boolean[10][10];
        int nAsignados;
        for(int i=0; i< matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int maxAttempts = 100;
                while (maxAttempts > 0) {
                    nAsignados = random.nextInt(10) + 1;
                    if (!asignados[i][nAsignados - 1]) {
                        matriz[i][j] = nAsignados;
                        asignados[i][nAsignados - 1] = true;
                        break;
                    }
                    maxAttempts--;
                }
            }
        }
        for(int i=0; i< matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        eliminarNumeros(matriz);
    }
    private static int[][]arrayInicial(int[][]array){
        for(int i=0; i<array.length;i++){
            for(int j=0; j< array[i].length;j++){
                if (array[i][j]!=0){
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
        return array;
    }
    private static int[][]eliminarNumeros(int[][]array){
        Scanner entrada= new Scanner(System.in);
        for(int i=0; i<array.length;i++){
            System.out.println("¿Cuantos numeros desea borrar en la linea "+(i+1)+"?");
            int numeros= entrada.nextInt();
            for (int j = 0; j < numeros; j++) {
                int numeroEliminar;
                boolean validNumber = false;

                do {
                    System.out.println("Ingrese el número que desea eliminar (1-10): ");
                    numeroEliminar = entrada.nextInt();
                    if (numeroEliminar >= 1 && numeroEliminar <= 10){
                        validNumber=true;
                    }
                    if (!validNumber) {
                        System.out.println("El número ingresado no está en el rango válido (1-10).");
                    }
                } while (!validNumber);

                for (int k = 0; k < array[i].length; k++) {
                    if (array[i][k] == numeroEliminar) {
                        array[i][k] = 0;
                        break;
                    }
                }
                arrayInicial(array);
            }
        }

        return array;
    }

}
