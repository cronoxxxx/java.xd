package DeClase;

import java.util.Random;
import java.util.Scanner;

/*
Ejercicio 3
Definir una clase OperacionesArray con los siguientes métodos:
    • Cargar un array
    • Listar contenido array
    • Ordenar array
    • Calcular media
    • Devolver una copia del array invertido
    • Método que diga si está o no está un número (devuelva un booleano)
Definir una clase Tester para utilizar OperacionesArray.

 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos elementos desea tener en el array");
        int elementos = entrada.nextInt();
        int[] arreglo = new int[elementos];
        cargarArray(arreglo);
        listarArray(arreglo);
        MetodoBurbuja(arreglo);
        BuscarNum(arreglo);

    }

    private static int[] cargarArray(int[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }
        return arreglo;
    }

    private static int[] listarArray(int[] arreglo) {
        System.out.println("ARRAY LISTADO");
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }
        return arreglo;
    }

    private static int[] MetodoBurbuja(int[] arreglo) {
        int aux;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                boolean valido=false;
                if (arreglo[j] > arreglo[j + 1]) {
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    valido=true;
                }
            }
        }
        System.out.println("\nARRAY ORDENADO");
        for (int i=0; i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
        MediaNumeros(arreglo);
        ArregloReversa(arreglo);
        return arreglo;
    }

    private static int[]MediaNumeros(int[]array){ int suma=0;
        for (int i = 0; i < array.length ; i++) {
            suma+=array[i];
        }
        System.out.println("SUMA DE NUMEROS: "+suma);
        return array;
    }
    private static int[] ArregloReversa(int[]arreglo){
        System.out.println("\nARRAY INVERTIDO");
        for (int i= arreglo.length-1;i>=0;i--){
            System.out.print(arreglo[i]+" ");
        }
        BuscarNum(arreglo);
        return arreglo;
    }
    private static int[] BuscarNum(int[]arreglo){
        Scanner entrada= new Scanner(System.in);
        for (int i=0; i<1;i++){
            boolean esValido;
            do {
                esValido=false;
                System.out.println("Ingrese el numero a buscar");
                int NB;
                do {
                    NB= entrada.nextInt();
                    if (NB<0 || NB>100){
                        System.err.println("El numero esta fuera de los limites");
                    }
                }while (NB<0 || NB>100);
                for (int j=0; j< arreglo.length;j++){
                    if (arreglo[j]==NB){
                        System.out.println("El numero ha sido encontrado en la posición "+(j+1));
                        esValido=true;
                    }
                }
                if (!esValido){
                    System.err.println("Numero no encontrado, por favor, intentelo de nuevo");
                }
            }while (!esValido);
        }
        return arreglo;
    }
}
