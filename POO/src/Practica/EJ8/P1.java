package Practica.EJ8;

import java.util.Scanner;

/*
Desarrolla un programa que solicite dos números al usuario,
los divida y muestre el resultado.
 */
public class P1 {
    float N1,N2,division;
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        N1= entrada.nextFloat();
        System.out.println("Ingrese otro");
        N2= entrada.nextFloat();
    }
    public void dividir(){
        division=N1/N2;
    }
    public void salida(){
        System.out.println("Division de los dos numeros es: "+division);
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.dividir();
        o1.salida();
    }
}
