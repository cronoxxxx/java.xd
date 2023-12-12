package Practica.EJ6;

import java.util.Scanner;

public class P2 {
    public void salidas(String nombre, byte edad){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad);
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre= entrada.nextLine();
        System.out.println("Ingrese su edad");
        byte edad= entrada.nextByte();
        o2.salidas(nombre,edad);
    }
}
