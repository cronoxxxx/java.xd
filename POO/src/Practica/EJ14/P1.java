package Practica.EJ14;

import java.util.Scanner;

public class P1 {
    int decimal;
    int modulo;
    int aux;
    String binario="";
    public void declarar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero base");
        decimal= entrada.nextInt();
    }
    public void binario(){
        aux=decimal;
        while (decimal>0){
            modulo=decimal%2;
            binario=modulo+binario;
            decimal=decimal/2;
        }
    }

    public void salida(){
        System.out.println("El binario de "+aux+" es:  "+binario);
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.declarar();
        o1.binario();
        o1.salida();
    }
}
