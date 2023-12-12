package ejercicios;

import java.util.Scanner;

/*
Hacer un programa que diga cuantas veces aparece cada uno de los elementos de un array. El programa ha de controlar que un número no se analice dos veces;
por ejemplo, si hay un 3 en la segunda posición y otro en la sexta, el programa ha de decir que el 3 aparece dos veces,
pero sólo cuando encuentra el que hay en la tercera posición, cuando encuentre el que hay a la sexta, no lo tiene que evaluar.
Sugerencia, utilizar un array auxiliar para ir guardando los elementos analizados.
 */
public class ej14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int elementos = entrada.nextInt();
        int[] arreglo = new int[elementos];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ". Ingrese un numero");
            arreglo[i] = entrada.nextInt();
        }
        //MATRIZ ORIGINAL
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " ");
        }

        boolean[] yaContado = new boolean[elementos];
        for (int i = 0; i < arreglo.length; i++) {
            if (!yaContado[i]) { //Si no hay numeros ya contados (repetidos)
                int contador = 1;
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[i] == arreglo[j]) { //Si
                        contador++;
                        yaContado[j] = true; //EL REPETIDO EN LA POSICION J
                    }
                }
                System.out.println("El numero "+arreglo[i]+" se encuentra "+contador+" veces"); //No sale del condicional porque solo se imprime los valores en false del boolean
            }
        }

    }
}