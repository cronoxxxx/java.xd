package ejercicios;

import java.util.Scanner;

/*
Hacer un programa que gire los elementos de  una lista de modo que el primero se intercambia con el último, el segundo con el penúltimo,...
 */
public class ej11 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas= entrada.nextInt();
        int[]arreglo= new int[filas];
        for (int i=0; i<filas;i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextInt();
        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i=0; i<filas;i++){
            System.out.print(arreglo[i]+" ");
        }
        //INTERCAMBIO

        int aux;
        for (int i=0; i<filas/2;i++){
                aux=arreglo[i];
                arreglo[i]= arreglo[filas - 1 - i];
                arreglo[filas - 1 - i]=aux;
        }
        System.out.println("MATRIZ INTERCAMBIADA");
        for (int i=0; i<filas;i++){
            System.out.print(arreglo[i]+" ");
        }
    }
}
