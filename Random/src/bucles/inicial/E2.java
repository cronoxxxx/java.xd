package bucles.inicial;

import java.util.Scanner;

/*
Pedir por teclado un número (llamémosle num1), y mostrar todos los números desde el 1 hasta num1
 */
public class E2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese hasta el numero que quiera mostrar ");
        int numeroamostrar= entrada.nextInt();
        for (int i=0; i<=numeroamostrar;i++){
            System.out.print(i+" ");
        }
    }
}
