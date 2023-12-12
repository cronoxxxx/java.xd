package ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
Hacer un programa que intercambie el primer y el último elemento de una lista.
 */
public class ej10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Random random= new Random();
        System.out.println("Ingrese el numero de filas");
        int filas= entrada.nextInt();
        int[]arreglo=new int[filas];
        for (int i=0; i<filas;i++){
            arreglo[i]= random.nextInt(41)-20;
        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i=0; i<filas;i++){
            System.out.print(arreglo[i]+" ");
        }
        int aux;
        for (int i=0; i<filas; i++){
            if (i==0){
                aux=arreglo[i];
                arreglo[i]=arreglo[filas-1];
                arreglo[filas-1]=aux;
            }
        }
        System.out.println("\nMATRIZ INTERCAMBIADA");
        for (int i=0; i<filas;i++){
            System.out.print(arreglo[i]+" ");
        }
    }
}
