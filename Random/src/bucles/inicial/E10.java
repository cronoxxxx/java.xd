package bucles.inicial;

import java.util.Scanner;

/*
Programa que pide dos números por teclado, a y b. A continuación, escribe todos los números
menores de 100 que son múltiplos de a y de b a la vez.
 */
public class E10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1= entrada.nextInt();
        System.out.println("Ingrese otro numero");
        int n2= entrada.nextInt();
        System.out.println("NUMEROS MULTIPLOS DE A Y B");
        for (int i=0; i<100;i++){
            if (i%n1==0 && i%n2==0){
                System.out.print(i+" ");
            }
        }
    }
}
