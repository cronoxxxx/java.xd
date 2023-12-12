package ejercicios;

import java.util.Scanner;

/*
Sumar todos los elementos de una matriz y asignarle esa suma de tamaño a un arreglo y dado a ese arreglo, rellenarlo e imprimirlo
 */
public class Ej19 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas= entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas= entrada.nextInt();
        int [][]matriz= new int[filas][columnas];
        int suma=0;
        for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
            System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]= entrada.nextInt();
            suma+=matriz[i][j];
            }
        }
        System.out.println("La suma de toda la matriz es: "+suma);
        int []arreglo= new int[suma];
        System.out.println("Matriz de tamaño "+suma+": ");
        for (int i=0; i<suma; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextInt();
        }
        for (int i=0; i<suma; i++){
            System.out.print(arreglo[i]+" ");
        }

    }
}
