package ejercicios;

import java.util.Scanner;

/*
    2. Hacer un programa en el que dado el siguiente array de nombre origen:

    1. Lo recorre metiendo en un segundo array de nombre destino todos aquellos elementos que sean pares y mayores de 25
    2. Muestre en pantalla el contenido de los dos arrays unidimensionales
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[]origen=new int[12];
        int contador=0;

        for (int i=0; i<12;i++){
            System.out.println((i+1)+". Ingrese un numero");
            origen[i]= entrada.nextInt();
        }
        System.out.println("ARREGLO ORIGINAL");
        for (int i=0; i<12;i++){
            System.out.print(origen[i]+" ");
        }
        for (int i=0; i<12;i++){
            if (origen[i]%2==0|| origen[i]>25){
                contador++;
            }
        }
        System.out.println("\nARREGLO NUEVO");
        int[] nuevo = new int[contador];
        int indexNuevo = 0;
        for (int i = 0; i < 12; i++) {
            if (origen[i] % 2 == 0 || origen[i] > 25) {
                nuevo[indexNuevo] = origen[i];
                indexNuevo++;
            }
        }

        for (int i = 0; i < contador; i++) {
            System.out.print(nuevo[i] + " ");
        }

    }
}
