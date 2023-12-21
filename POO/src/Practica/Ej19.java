package Practica;

import java.util.Random;
import java.util.Scanner;

/*
EJEMPLO 5: Crear un programa que tenga dos arrays, uno con los 6 números de una apuesta de
la primitiva, y otro con los 6 números ganadores. Los arrays se rellenan aleatoriamente.
El programa debe luego informar del número de aciertos, y mostrar también los dos arrays.
 */
public class Ej19 {
    public static void main(String[] args) {
        Ej19 principal= new Ej19();
        int[]arreglo= new int[6];
        boolean [] noRepetidas= new boolean[100];
        int[]ganador= new int[6];
        principal.esRepetido(noRepetidas,arreglo);
        principal.Ganadores(ganador,arreglo);
        int []numeroAdivinar=new int[6];
        principal.Adivinar(ganador,numeroAdivinar);


    }

    public int[] esRepetido (boolean[]noRepetidas, int[]arreglo){
        Random random= new Random();
        for (int i = 0; i < arreglo.length; i++) {
            int numeros= random.nextInt(100)+1;
            if (noRepetidas[numeros-1]){
                i--;
            } else {
                noRepetidas[numeros-1]=true;
                arreglo[i]=numeros;
            }
        }
        return arreglo;
    }

    public int[] Ganadores(int[] ganador, int[]arreglo){
        for (int i=0; i<arreglo.length;i++){
            ganador[i]=arreglo[i];
        }
        for (int i=0; i< ganador.length;i++){
            System.out.print(ganador[i]+" ");
        }
        return ganador;
    }

    public int[] Adivinar(int[]ganador, int []numeroAdivinar){
        Scanner entrada= new Scanner(System.in);
        for (int i=0; i< numeroAdivinar.length;i++){
            System.out.println("Ingresa un numero a adivinar");
            do {
                numeroAdivinar[i]=entrada.nextInt();
                if (numeroAdivinar[i]<0 || numeroAdivinar[i]>100){
                    System.err.println("Numero fuera de limites, ingrese uno valido");
                }
            }while (numeroAdivinar[i]<0 || numeroAdivinar[i]>100);

        }
        adivinado(ganador, numeroAdivinar);
        return numeroAdivinar;
    }

    public int[]adivinado(int[]ganador, int[]numeroAdivinar){
        int contadorAciertos=0;
        for (int i=0;i< numeroAdivinar.length;i++){
            for (int j=0; j< ganador.length;j++){
                if (numeroAdivinar[i]==ganador[j]){
                    contadorAciertos++;
                }
            }
        }
        System.out.println("Han habido "+contadorAciertos+" aciertos");
        for (int i=0;i<numeroAdivinar.length;i++){
            System.out.print(numeroAdivinar[i]+" ");
        }
        System.out.println();
        for (int i=0;i<ganador.length;i++){
            System.out.print(ganador[i]+" ");
        }
        return numeroAdivinar;
    }


}
