package Practica.EJ6;

import java.util.Scanner;

/*
Crea un programa que pida al usuario su nombre y edad,
y muestre un mensaje personalizado con esta información.
 */
public class P1 {
    String nombre;
    byte edad;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre= entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad= entrada.nextByte();
    }
    public void salida(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad);
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.salida();
    }
}
