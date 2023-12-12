package Practica.EJ12;

import java.util.Scanner;

public class P2 {
    public int fibonacci(int n1){
        int a=0;
        int b=1;
        int c;
        System.out.print(b+" ");
        for (int i=0; i<=n1-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        return n1;
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n1= entrada.nextInt();
        o2.fibonacci(n1);
    }
}
