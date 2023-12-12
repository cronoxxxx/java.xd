package Practica.EJ4;

import java.util.Scanner;

public class P2 {

    public String concat(String p1, String p2){
        String pa=p1+" "+p2;
        return pa;
    }

    public static void main(String[] args) {
        P2 oe= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String p1= entrada.nextLine();
        System.out.println("Ingresa otra");
        String p2= entrada.nextLine();
        String texto=oe.concat(p1,p2);
        System.out.println(texto);
    }
}
