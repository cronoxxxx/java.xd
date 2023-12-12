package Practica.EJ2;

import java.util.Scanner;

public class E2 {
    String saludar;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un texto");
        saludar= entrada.nextLine();
    }
    public void resultado(){
        String saludo= "Hola "+saludar;
        System.out.println(saludo);
    }

    public static void main(String[] args) {
        E2 o2= new E2();
        o2.declarar();
        o2.resultado();
    }
}
