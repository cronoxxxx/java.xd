package ejercicios;

import java.util.Scanner;

/*
Ejercicio: Invertir Lista

Escribe un programa en Java que solicite al usuario ingresar la cantidad de elementos en una lista. Luego, permite al usuario ingresar los elementos uno por uno.
Después, invierte el orden de los elementos en la lista y muestra la lista original y la lista invertida. Utiliza la misma lógica de intercambio que en el
ejercicio anterior para lograr la inversión.
 */
public class ej11similiar {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int elementos= entrada.nextInt();
        int[]arreglo=new int[elementos];
        System.out.println("GUARDANDO NUMEROS..");
        for (int i=0; i<elementos;i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]=entrada.nextInt();
        }
        System.out.println("ARREGLO ORIGINAL");
        for (int i=0; i<elementos;i++){
            System.out.print(arreglo[i]+" ");
        }
        //INVERTIR
        int aux;
        for (int i=0; i<elementos/2;i++){
            aux=arreglo[i];
            arreglo[i]=arreglo[elementos-1-i];
            arreglo[elementos-1-i]=aux;
        }

        System.out.println("\nARREGLO INVERTIDO");
        for (int i=0; i<elementos;i++){
            System.out.print(arreglo[i]+" ");
        }
    }
}
