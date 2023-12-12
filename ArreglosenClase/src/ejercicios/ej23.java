package ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
    23. Hacer un programa que:
    1. Cree un array unidimiensional de 10 elementos de tipo entero
    2. Cargar el array de valores aleatorios introducidos por teclado pero que estén ordenados de forma ascendente
    3. El programa ha de pedir al usuario que introduzca el valor a buscar, devolviendo la posición en el caso de encontrarlo o un
    mensaje del tipo “Elemento no encontrado” en caso contrario
 */
public class ej23 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int [] arreglo= new int[10];
        Random random= new Random();
        int i;
        int j;
        for (i=0; i< arreglo.length;i++){
            arreglo[i]= random.nextInt(100);
        }

        //METODO BURBUJA
        int aux;
        boolean bandera = true;
        for (i=0; i< arreglo.length-1;i++){
            do {
                for (j=0; j< arreglo.length-1;j++){
                    bandera=false;
                    if (arreglo[j]> arreglo[j+1]){
                        aux= arreglo[j];
                        arreglo[j]=arreglo[j+1];
                        arreglo[j+1]=aux;
                        bandera=true;
                    }
                }
            } while (bandera);
        }
        //PEDIR AL USUARIO BUSCAR EL NUMERO Y ORDENAR EL ARREGLO

        System.out.println("Ingrese el numero a continuacion que vos deseas buscar:");
        int numero= entrada.nextInt();
        boolean encontrado = false;
        for ( j = 0;  j< arreglo.length; j++) {
            if (arreglo[j] == numero) {
                encontrado = true;
                break;
            }
        }
        for (i=0; i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
        // Step 6: Display the result
        if (encontrado) {
            System.out.println("\nFELICIDADES, SE HA ENCONTRADO EL NUMERO QUE USTED DESEA en la posición " + (j+1));
        } else {
            System.err.println("NO SE HA ENCONTRADO EL VALOR EN EL ARREGLO");
        }
    }
}
