package Practica.EJ10;

import java.util.Scanner;

public class P2 {

    public int factorial(int n1){
        int producto=1;
        for (int i=1; i<=n1;i++){
            producto*=i;
        }
        System.out.println(producto);
        return n1;
    }

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        P2 o2= new P2();
        System.out.println("¿De que numero quiere sacar su factorial?");
        int n1= entrada.nextInt();
        o2.factorial(n1);
    }
}
