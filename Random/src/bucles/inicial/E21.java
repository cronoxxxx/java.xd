package bucles.inicial;

import java.util.Scanner;

/*
Realizar un programa que permita ir introduciendo una serie continua de números mientras su suma
no supere el valor 10000. Cuando esto ocurra, se debe mostrar el total acumulado, el contador de los
números introducidos y la media.
 */
public class E21 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int N;
        int suma = 0;
        int media;
        int contador=0;
        System.out.println("Introduciendo numeros con suma menor a 1000");
        do {
            System.out.println("Ingrese un numero");
            N= entrada.nextInt();
            suma+=N;
            contador++;
            media=suma/contador;
        }while (suma<10000);

        System.out.println("Se han registrado "+contador+" numeros");
        System.out.println("La media respecto a los numeros registrados es: "+media);
    }
}
