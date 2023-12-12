package Practica.EJ5;

import java.util.Scanner;

public class P2 {
    public int parImpar(int n1){

        if (n1%2==0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        return n1;
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1= entrada.nextInt();
        o2.parImpar(n1);
    }
}
