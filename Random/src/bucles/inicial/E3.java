package bucles.inicial;

import java.util.Scanner;

/*
Pedir por teclado 10 números e indicar si cada uno de ellos es positivo o negativo y si es par o impar.
MEJORA 1: No hay un número fijo de números, el programa pide repetidamente números hasta que
se introduzca un 0.
 */
public class E3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n;
            for (int i=0; i<10;i++){
                do {
                    System.out.println("Ingresar el numero "+(i+1)+": ");
                    n= entrada.nextInt();
                    if (n>0){
                        System.out.println(n+" es positivo");
                    }
                    if (n<0){
                        System.out.println(n+" es negativo");
                    }
                    if (n%2==0){
                        System.out.println(n+" es par");
                    } else {
                        System.out.println(n+" es impar");
                    }
                }while (n==0);
            }
    }
}
