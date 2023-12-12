package Practica.EJ8;

import java.util.Scanner;

public class P2 {
    public float division(float n1, float n2){
        float division=n1/n2;
        System.out.println("Resultado de la division es: "+division);
        return division;
    }

    public static void main(String[] args) {
        P2 oe= new P2();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        float n1= entrada.nextFloat();
        System.out.println("Ingrese otro");
        float n2= entrada.nextFloat();
        oe.division(n1,n2);
    }
}
