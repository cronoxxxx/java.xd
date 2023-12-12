package bucles.inicial;

import java.util.Scanner;

/*
Realizar un programa que pida al usuario un número, que debe estar entre 0 y 10. Si el usuario indica
un número erróneo, vuelve a pedir el número. Cuando se indice un número válido, se muestra la tabla
de multiplicar de dicho número.
 */
public class E19 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int N;
        System.out.println("Introduzca un numero y obtenga su tabla de multiplicar (mayor a 0 y menor que 10)");
        do {
        N= entrada.nextInt();
            if (N>0 && N<10){
                System.out.println("Tabla de "+N+": ");
                for (int i=0; i<=10;i++){
                    int producto=N*i;
                    System.out.print(N+" x "+i+"= "+producto);
                    System.out.println();
                }
            } else {
                System.err.println("Inserte un numero valido entre 0 y 10");
            }
        }while (N<=0 || N>=10);


    }
}
