package bucles.basicos;

import java.util.Random;

public class E6 {
    /*
    Escribir un bucle que de 5 vueltas y que elige en cada vuelta un número al azar entre 1 y 100, y al final nos dice cuántos pares salieron.
     */
    public static void main(String[] args) {
        Random puto= new Random();
        int n;
        int contador=0;
        for (int i=0; i<5;i++){
            n= puto.nextInt(100)+1;
            if (n%2==0){
                contador++;
            }
            System.out.print(n+" ");
        }
        System.out.println();
        if (contador>1){
            System.out.println("Hay "+contador+" numeros pares en total");
        }
        if (contador==1){
            System.out.println("Hay solo un numero par");
        }
        if (contador==0){
            System.err.println("No hay ningun numero par");
        }
    }
}
