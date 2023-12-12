package Practica.EJ9;

import java.util.Scanner;

/*
Crea un programa que solicite al usuario dos palabras,
las compare e indique si son iguales o diferentes
 */
public class P1 {
    String p1;
    String p2;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        p1= entrada.nextLine();
        System.out.println("Ingrese otra palabra");
        p2= entrada.nextLine();
    }
    public void igualacion(){
        if (p1.equalsIgnoreCase(p2)){
            System.out.println("Son palabras iguales");
        } else {
            System.err.println("No son palabras iguales");
        }
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.igualacion();
    }
}
