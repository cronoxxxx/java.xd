import java.util.Scanner;

public class Ej11Solucion2 {
    /*
    Invierte un arreglo de n elementos a otro arreglo
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int n= entrada.nextInt();
        int [] arreglo= new int[n];
        for (int i=0; i< arreglo.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextInt();
        }
        System.out.println("\nEl arreglo es:");
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
        //Creamos un arreglo auxiliar
        int[]auxiliar= new int[n];
        int j = 0;
        for (int i = arreglo.length - 1; i >= 0; i--, j++){
            auxiliar[j] = arreglo[i];
        }
        //Imprimimos el inverso
        System.out.println("\nEl arreglo invertido es:");
        for (int i=0; i< auxiliar.length; i++){
            System.out.print(auxiliar[i]+" ");
        }

    }
}
