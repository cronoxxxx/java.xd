package ejercicios;

import java.util.Scanner;

/*
    3. Hacer un programa que:
    1. Lea una secuencia de 15 números enteros almacenándolos en un array de nombre “números”
    2. Los visualice en el dispositivo estándar de salida en orden inverso al de entrada
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[]array=new int[15];
        System.out.println("GUARDANDO NUMEROS...");
        for (int i=0; i<15;i++){
            System.out.println((i+1)+". Ingrese un numero");
            array[i]= entrada.nextInt();
        }
        System.out.println("ARREGLO ORIGINAL");
        for (int i=0; i<15;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\nARREGLO EN ORDEN INVERSO");
        for (int i=14; i>=0;i--) {
            System.out.print(array[i]+" ");
        }
        int aux;
        System.out.println("\nARREGLO EN ORDEN INVERSO ARREGLADO");
        for (int i=14; i>=1;i--) {
            if (array[i]<array[i-1]){
                aux=array[i];
                array[i]=array[i-1];
                array[i-1]=aux;
        }
        }
        for (int i=14; i>=0;i--) {
            System.out.print(array[i]+" ");
        }
        }
        }


