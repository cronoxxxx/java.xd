package bucles.medio;

import java.util.Scanner;

/*
Se solicita una número por teclado, y nos dice si es primo o no lo es (ayuda: un primo se puede definir
como un número que tiene algún divisor además de 1 y de si mismo)
 */
public class E3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int contadorprimo = 0;
        int N = entrada.nextInt();
        System.out.println("ORDEN DE DIVIDENDOS: ");
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                contadorprimo++;
                System.out.print(i+" ");

            }

        }
        System.out.println();
        if (contadorprimo == 2) {
            System.out.println(N+" es un numero primo");
        } else{
            System.out.println(N+" no es un numero primo");
        }


    }
}
