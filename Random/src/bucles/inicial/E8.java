package bucles.inicial;

import java.util.Scanner;

/*
Realizar un programa que sume los 100 números siguientes a un número entero y positivo introducido
por teclado por el usuario. Se debe comprobar que el dato introducido es correcto (que es un número
positivo).
 */
public class E8 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n;
        int suma=0;
        do {
            System.out.println("Introduce un numero positivo");
            n= entrada.nextInt();
            if (n<0){
                System.err.println("Ingrese un positivo");
            }
        }while (n<0);
        int valor= n+100;
        for (int i=n; i<=valor;i++){
            System.out.print(i+" ");
            suma+=i;
        }
        System.out.println();
        System.out.println("La suma de todos los 100 numeros siguientes a "+n+" es: "+suma);
    }
}
