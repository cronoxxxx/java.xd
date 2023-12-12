package Practica.EJ12;

import java.util.Scanner;

/*
Crea un programa que solicite al usuario un número y calcule e
imprima los primeros N términos de la secuencia de Fibonacci.
 */
public class P1 {
    int N;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        N= entrada.nextInt();
    }
    public void fibonacci(){
        int a=0;
        int b=1;
        int c;

        System.out.print(b+" ");
        for (int i=0; i<=N-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.fibonacci();
    }
}
