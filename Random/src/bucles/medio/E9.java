package bucles.medio;

import java.util.Scanner;

/*
Programa que genera los N primeros números de la serie de Fibonacci. El valor N deberá ser leído por
el teclado. NOTA: Los dos primeros números son fijos, son 1, y el resto se obtiene sumando los dos
anteriores: 1,1,2,3,5,8,13,21
 */
public class E9 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca hasta que numeros desea ver la serie Fibonacci: ");
        int N= entrada.nextInt();
        int a=0;
        int b=1;
        int suma;
        System.out.print(b+" ");
        for (int i=1; i<=N;i++){
            suma=a+b;
            a=b;
            b=suma;
            System.out.print(suma+" ");
        }
    }
}
