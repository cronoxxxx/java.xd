package Practica.EJ11;

import java.util.Scanner;

public class P2 {
    public int siesPrimo(int n1){
        int contador=0;
        for (int i=1; i<=n1;i++){
            if (n1%i==0){
                contador++;
                System.out.print(i+" ");
            }
        }
        if (contador==2){
            System.out.println("Es un numero primo");
        } else {
            System.out.println("No es un numero primo");
        }
        return n1;
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1= entrada.nextInt();
        o2.siesPrimo(n1);
    }
}
