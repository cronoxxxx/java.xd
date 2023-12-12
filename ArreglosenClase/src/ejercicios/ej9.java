package ejercicios;

import java.util.Random;

/*
Hacer un programa que sume los números que hay en las posiciones pares de una lista de diez elementos.
 */
public class ej9 {
    public static void main(String[] args) {
        Random random=new Random();
        int[]elementos=new int[10];
        int suma=0;
        for (int i=0; i<10;i++){
            elementos[i]= random.nextInt(41)-20;
        }
        System.out.println("ARREGLO");
        for (int i=0; i<10;i++){
            System.out.print(elementos[i]+" ");
        }
        for (int i=0; i<10;i++){
            if (elementos[i]%2==0){
                suma+=elementos[i];
            }
        }
        System.out.println("SUMA DE LOS NUMEROS PARES EN EL ARREGLO: "+suma);
    }
}
