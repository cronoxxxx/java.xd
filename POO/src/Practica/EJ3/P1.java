package Practica.EJ3;

import java.util.Scanner;

/*
Crea un programa que pida al usuario dos números, los multiplique y devuelva el resultado.
 */
public class P1 {
    int n1;
    int n2;
    int producto;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        n1= entrada.nextInt();
        n2= entrada.nextInt();
    }
    public void producto(){
        producto=n1*n2;
    }
    public void salida(){
        System.out.println("El producto de dos numeros es: "+producto);
    }

    public static void main(String[] args) {
        P1 o1=new P1();
        o1.declarar();
        o1.producto();
        o1.salida();
    }
}
