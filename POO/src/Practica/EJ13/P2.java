package Practica.EJ13;

import java.util.Scanner;

public class P2 {
    public String palindromo(String N){
        N= N.toUpperCase();
        N=N.replaceAll("\\s"," ");
        boolean esPalindromo=false;
        char[]x=N.toCharArray();
        int size= x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
            if (x[i]==x[size-i]){
                esPalindromo=true;
            }
        }
        if (esPalindromo){
            System.out.println("Es palindromo");
        } else {
            System.err.println("No es palindromo");
        }
        return N;
    }

    public static void main(String[] args) {
        P2 o2= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String N= entrada.nextLine();
        o2.palindromo(N);
    }
}
