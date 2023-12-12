package bucles.inicial;

import java.util.Scanner;

/*
Pedir por teclado un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
número negativo.
 */
public class E14 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double N;
        double result;
        do {
            System.out.println("Ingrese un numero");
            N= entrada.nextDouble();
            result=Math.pow(N,2);
        }while (N<0);
        System.out.println("El cuadrado de "+N+" es: "+result);
    }
}
