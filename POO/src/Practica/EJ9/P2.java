package Practica.EJ9;

import java.util.Scanner;

public class P2 {
    public void igualacion(String p1, String p2){
        if (p1.equalsIgnoreCase(p2)){
            System.out.println("Son palabras iguales");
        } else {
            System.err.println("No son palabras iguales");
        }
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String p1= entrada.nextLine();
        System.out.println("Ingrese otra palabra");
        String p2= entrada.nextLine();
        o2.igualacion(p1,p2);
    }
}
