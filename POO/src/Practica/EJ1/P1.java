package Practica.EJ1;

import java.util.Scanner;

/*
Realiza un programa que solicite al usuario dos números, los sume y muestre el resultado.
 */
public class P1 {
    int n1,n2;
    int suma;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        n1= entrada.nextInt();
        n2= entrada.nextInt();
    }
    public void sumar(){
        suma=n1+n2;
    }

    public void salida(){
        System.out.println("La suma de dos numeros es: "+suma);
    }

    public static void main(String[] args) {
        P1 o1=new P1();
        o1.declarar();
        o1.sumar();
        o1.salida();
    }

}
