package Practica.EJ13;

import java.util.Scanner;

public class P1 {
    String texto;
    public void lectura(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una frase/palabra");
        texto=entrada.nextLine();

    }
    public void palindromo(){
        texto=texto.replaceAll("\\s"," ");
        texto=texto.toUpperCase();
        boolean esPalindromo=false;
        char[]x=texto.toCharArray();
        int size=x.length-1;
        for (int i=0; i<x.length/2;i++){
            if (x[i]==x[size-i]){
                esPalindromo=true;
            }
        }
        if (esPalindromo){
            System.out.println("Es un texto palindromo");
        } else {
            System.err.println("No es un texto palindromo");
        }
    }

    public static void main(String[] args) {
        P1 o1= new P1();
        o1.lectura();
        o1.palindromo();
    }
}
