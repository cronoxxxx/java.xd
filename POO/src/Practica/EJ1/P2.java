package Practica.EJ1;

import java.util.Scanner;

public class P2 {
    public int sumar(int n1,int n2){
        int suma=n1+n2;
        return suma;
    }


    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int n1= entrada.nextInt();
        int n2=entrada.nextInt();
        int suma= o2.sumar(n1,n2);
        System.out.println("La suma de dos numeros es: "+suma);
    }
}
