package Practica.EJ16;

import java.util.Random;
import java.util.Scanner;

/*
Realice una matriz y si el usuario elige x linea, esa linea tendra valor -1
 */
public class P1 {
    int[][] matriz;

    public void declarar() {
        Random random = new Random();
        matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10)+1;
            }
        }
    }

    public void lectura() {
        Scanner entrada = new Scanner(System.in);
        int filaSel;
        do {
            System.out.println("¿Que fila desea reducir?");
            filaSel = entrada.nextInt();
        } while (filaSel > 5 || filaSel < 1);
        for (int i = 0; i < matriz.length; i++) {
            if (i == filaSel-1) {
                for (int j = 0; j < matriz[i].length - 1; j++) {
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
    }
    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.lectura();
    }
}
