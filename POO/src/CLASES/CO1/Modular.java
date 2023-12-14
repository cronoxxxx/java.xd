package CLASES.CO1;

import java.util.Scanner;

public class Modular {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Practica de prueba");
        int n;
        for (int i=0; i<10;i++){
            System.out.println((i+1)+ ". Ingrese un numero");
            n= entrada.nextInt();
            System.out.println(n);
        }
    }
}
