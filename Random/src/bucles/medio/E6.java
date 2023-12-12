package bucles.medio;

import java.util.Scanner;

/*
Programa que pide por teclado un número y muestra la suma de sus divisores, sin incluir el propio
número entre sus divisores.
 */
public class E6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int N= entrada.nextInt();
        for (int i=1; i<N;i++){
            if (N%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
