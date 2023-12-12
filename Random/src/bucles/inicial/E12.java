package bucles.inicial;

import java.util.Random;


/*
Pedir 10 números enteros por teclado. De todos ellos, mostrar la media de los números que sean pares,
mostrar la media de los que sean negativos.
 */
public class E12 {
    public static void main(String[] args) {
        Random random=new Random();
        int sumapares=0;
        int sumaneg=0;
        int contadorpares=0;
        int contadorneg=0;
        int medianeg = 0;
        int mediapares = 0;
        int variante;
        boolean esnegativo=false;
        boolean espar=false;

        for (int i=0; i<10;i++){
            variante= random.nextInt(201)-100;
            if (variante<0){
                System.out.println(variante+" es negativo ");
                sumaneg+=variante;
                contadorneg++;
                medianeg=sumaneg/contadorneg;
                esnegativo=true;
                if (variante % 2 == 0) {
                    System.out.println(variante + " también es par ");
                    sumapares += variante;
                    contadorpares++;
                    mediapares = sumapares / contadorpares;
                    espar = true;
                }

            } else if (variante%2==0){
                System.out.println(variante+" es par ");
                sumapares+=variante;
                contadorpares++;
                mediapares=sumapares/contadorpares;
                espar=true;
            }

        }
        System.out.println();
        if (esnegativo){
            System.out.println("La media de los negativos es: "+medianeg);
        } else {
            System.err.println("No hay ningun negativo");
        }

        if (espar){
            System.out.println("La media de los pares es: "+mediapares);
        } else {
            System.err.println("No hay ningun par");
        }
    }
}
