package Practica.EJ11;

import java.util.Scanner;

/*
Escribe un programa que solicite al usuario un número y determine si es un número primo.
 */
public class P1 {
    int n1;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n1= entrada.nextInt();
    }
    public void siesPrimo(){
        int contador=0;
        for (int i=1; i<=n1;i++){
            if (n1%i==0){
                contador++;
                System.out.print(i+" ");
            }
        }
        if (contador==2){
            System.out.println("\nEs un numero primo");
        } else {
            System.out.println("\nNo es un numero primo");
        }
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.siesPrimo();
    }
}
