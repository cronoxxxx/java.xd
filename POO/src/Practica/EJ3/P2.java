package Practica.EJ3;

import java.util.Scanner;

public class P2 {
    public int producto(int n1, int n2){
        int mult=n1*n2;
        return mult;
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int n1= entrada.nextInt();
        int n2= entrada.nextInt();
        int producto= o2.producto(n1,n2);
        System.out.println("El producto de dos numeros es: "+producto);
    }
}
