package Practica.EJ14;

import java.util.Scanner;

public class P2 {
    public int binario(int decimal){
        int modulo;
        String binario="";
        int aux=decimal;
        while (decimal>0){
            modulo=decimal%2;
            binario=modulo+binario;
            decimal/=2;
        }
        System.out.println("El decimal de "+aux+" es: "+binario);
        return decimal;
    }

    public static void main(String[] args) {
        P2 oe= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int decimal= entrada.nextInt();
        oe.binario(decimal);
    }
}
