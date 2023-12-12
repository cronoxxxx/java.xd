package bucles.inicial;

import java.util.Scanner;

/*
Hacer un programa que lea un número entero por teclado y escriba los números enteros impares
que hay desde el 1 hasta el número leído (éste incluido), pero escribiendo solo 5 números por línea.
Ejemplo para el 26:
1 3 5 7 9
11 13 15 17 19
21 23 25
 */
public class E9 {
    public static void main(String[] args) {
        //Para positivos y para negativos
        Scanner entrada= new Scanner(System.in);
        int n;
        int contador = 0;
        System.out.println("Ingrese un numero para leer sus impares");
        n= entrada.nextInt();
        if (n==0){
            System.out.println("No hay nada para leer");
        } else if (n>0){
            for (int i=1; i<=n;i+=2){
                System.out.print(i + " ");
                contador++;
                if (contador == 5) {
                    System.out.println();
                    contador = 0;  // Reinicia el contador para la siguiente línea
                }
            }
        }else {
            for (int i=-1; i>=n;i-=2){
                System.out.print(i + " ");
                contador++;
                if (contador == 5) {
                    System.out.println();
                    contador = 0;  // Reinicia el contador para la siguiente línea
                }
            }
        }

    }
}
