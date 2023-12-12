package bucles.medio;

import java.util.Scanner;

/*
Escribir un programa que pida una base y un exponente (entero positivo) y que calcule la potencia
 */
public class E4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una base");
        int base= entrada.nextInt();
        int exponente;
        int potencia = 0;
        System.out.println("Ingrese un exponente");
        do {
            exponente= entrada.nextInt();
            if(exponente<0){
                System.err.println("Ingrese un exponente entero positivo");
            }
        }while (exponente<0);
        
        for (int i=0; i<=exponente;i++){
            potencia=base*i;
        }
        System.out.println(base+" elevado a "+exponente+" es "+potencia);
    }
}
