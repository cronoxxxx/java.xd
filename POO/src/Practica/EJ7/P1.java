package Practica.EJ7;

import java.util.Scanner;

/*
Implementa un programa que tome una palabra como entrada y devuelva
la longitud de la palabra.
 */
public class P1 {
    String palabra;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra= entrada.nextLine();
    }
    public void longitud(){
        System.out.println("Longitud de la palabra: "+palabra.length());
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.longitud();
    }
}
