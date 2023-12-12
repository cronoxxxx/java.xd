package ejercicios;

import java.util.Scanner;

/*
**Ejercicio Similar - Filtrado de Elementos:**

Dado el siguiente array llamado `origen` de tamaño 10:

1. Solicite al usuario ingresar 10 números y almacénelos en el array `origen`.
2. Muestre en pantalla el contenido del array `origen`.

Su tarea es:

1. Recorrer el array `origen` y almacenar en un segundo array llamado `nuevo` todos aquellos elementos que sean impares y menores de 20.
2. Mostrar en pantalla el contenido de ambos arrays unidimensionales: `origen` y `nuevo`.

**Condiciones Adicionales:**
- Utilice un bucle para recorrer y llenar los arrays.
- Implemente condiciones lógicas para determinar qué elementos se incluyen en el array `nuevo`.
- Asegúrese de mostrar claramente el contenido de ambos arrays al final del programa.

Este ejercicio permite practicar la manipulación de arrays y la aplicación de condiciones para filtrar elementos específicos.
 */
public class similarej2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[]origen= new int[10];
        int contador=0;
        for (int i=0; i<10;i++){
            System.out.println((i+1)+". Ingrese un numero");
            origen[i]= entrada.nextInt();
        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i=0; i<10;i++){
            System.out.println(origen[i]+" ");
        }

        for (int i=0; i<10;i++){
            if (origen[i]%2!=0 || origen[i]<20){
                contador++;
            }
        }

        int[]vector=new int[contador];
        int indice=0;
        for (int i=0; i<10;i++){
            if (origen[i]%2!=0 || origen[i]<20){
                vector[indice]=origen[i];
                indice++;
            }
        }
        System.out.println("ARREGLO CON NUMEROS PARES Y NUMEROS MENORES A 20");
        for (int i=0; i<contador;i++){
            System.out.print(vector[i]+" ");
        }
    }
}
