package Practica.EJ7;

import java.util.Scanner;

public class P2 {
    public String longitud(String palabra){
        System.out.println("Longitud de la palabra: "+palabra.length());
        return palabra;
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String texto= entrada.nextLine();
        o2.longitud(texto);
    }
}
