package Practica.EJ5;

import java.util.Scanner;

/*
Desarrolla un programa que solicite un número al usuario y determine si es par o impar.
 */
public class P1 {
    int n1;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n1= entrada.nextInt();
    }
    public void parImpar(){
        if (n1%2==0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.parImpar();
    }
}
