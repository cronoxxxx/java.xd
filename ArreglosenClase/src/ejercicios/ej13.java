package ejercicios;

import java.util.Scanner;

/*
    13. Diseña un programa JAVA para realizar la conversión de números en base decimal entre 0 y 32000 a base hexadecimal. Para ello el algoritmo tendrá como:

Datos de entrada: Un número entero positivo entre 0 y 32000 cualquiera dado por el usuario. El programa deberá verificar que el numero entrado cumple esas condiciones.

Datos de salida: Impresión en pantalla de un array de caracteres que contenga el equivalente en base hexadecimal del numero entrado. Este array deberá estar formado por
un máximo de cuatro elementos (dígitos) que pueden ser cifras entre 0 y 9 y letras entre A y F.
 */
public class ej13 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[]digitoex=new int[20];
        int residuo;
        int resultado;
        int i=0;
        int decimal;
        System.out.println("Ingrese el numero decimal a convertir");
        do {
            decimal= entrada.nextInt();
            if (decimal>32000){
                System.err.println("Ingrese otro numero");
            }
        }while (decimal>32000);

        do {
            residuo=decimal%16;
            resultado=decimal/16;
            digitoex[i]= residuo;
            decimal=resultado;
            i++;
        }while (decimal>0);
        System.out.println("El equivalente en hexadecimal es:");
        for (int j = i - 1; j >= 0; j--) {
            if (digitoex[j]==10){
                System.out.print("A");
            } else if (digitoex[j]==11){
                System.out.print("B");
            }else if (digitoex[j]==12) {
                System.out.print("C");
            }else if (digitoex[j]==13) {
                System.out.print("D");
            }else if (digitoex[j]==14) {
                System.out.print("E");
            }else if (digitoex[j]==15) {
                System.out.print("F");
            }else {
                System.out.print(digitoex[j]+"");
            }
        }
    }
}
