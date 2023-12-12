
import java.util.Scanner;

public class Ej15 {
    /*
    Mezclar 2 arreglos ordenados de forma creciente de 10 elementos en un tercer arreglo con un total de 20 elementos
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        int[] arreglo3 = new int[20];
        boolean esCreciente = false;
        System.out.println("PRIMER ARREGLO");
        do {
            for (int i = 0; i < arreglo1.length; i++) {
                System.out.println((i + 1) + ". Ingrese un numero");
                arreglo1[i] = entrada.nextInt();
            }
            for (int i = 0; i < arreglo1.length - 1; i++) {
                if (arreglo1[i] < arreglo1[i + 1]) {
                    esCreciente = true;
                } else {
                    esCreciente = false;
                    break;
                }
            }
            if (!esCreciente){
                System.err.println("Vuelva a escribir los digitos de forma creciente");
            }
        }while (!esCreciente);
        System.out.println("\nSEGUNDO ARREGLO");
        do {
            for (int i = 0; i < arreglo2.length; i++) {
                System.out.println((i + 1) + ". Ingrese un numero");
                arreglo2[i] = entrada.nextInt();
            }
            for (int i = 0; i < arreglo2.length - 1; i++) {
                if (arreglo2[i] < arreglo2[i + 1]) {
                    esCreciente = true;
                } else {
                    esCreciente = false;
                    break;
                }
            }
            if (!esCreciente){
                System.err.println("Vuelva a escribir los digitos de forma creciente");

            }
        }while (!esCreciente);

        int i=0;
        int j=0;
        int k=0;

        //Llenamos uno de los dos arreglos
        while (i<10 && j<10){
            if (arreglo1[i]<arreglo2[j]){
                arreglo3[k]=arreglo1[i];
                i++;
            } else {
                arreglo3[k]=arreglo2[j];
                j++;
            }
            k++;
        }
        if (i==10 ) {
            while (j<10){
                arreglo3[k]=arreglo2[j];
                j++;
                k++;
            }
        } else {
            while (i<10){
                arreglo3[k]=arreglo1[i];
                i++;
                k++;
            }
        }

        System.out.println("El arreglo mezclado es: ");
        for (k=0; k<arreglo3.length; k++){
            System.out.print(arreglo3[k]+" ");
        }
    }
}
