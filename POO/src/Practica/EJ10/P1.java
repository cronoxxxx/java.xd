package Practica.EJ10;

import java.util.Scanner;

/*
Implementa un programa que pida al usuario un número y calcule su factorial.
 */
public class P1 {
    int n1;
    int producto=1;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿De que numero quiere sacar su factorial?");
        n1= entrada.nextInt();
    }

    public void factorial(){
        for (int i=1; i<=n1;i++){
            producto*=i;
        }
    }

    public void salida(){
        System.out.println("El factorial del numero es: "+producto);
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.factorial();
        o1.salida();
    }
}
