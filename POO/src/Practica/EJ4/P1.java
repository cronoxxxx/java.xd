package Practica.EJ4;

import java.util.Scanner;

/*
Escribe un programa que tome dos cadenas como entrada, las concatene
y muestre el resultado.
 */
public class P1 {
    String p1;
    String p2;
    public void declarar(){
    Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        p1= entrada.nextLine();
        System.out.println("Ingresa otra");
        p2= entrada.nextLine();

    }
    public void concatenacion(){
        System.out.println(p1+" "+p2);
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.concatenacion();
    }

}
