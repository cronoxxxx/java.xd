package bucles.inicial;

import java.util.Scanner;

/*
Realizar un programa que pida al usuario un número, positivo y mayor que 1. A continuación, el
programa escribirá los números de la serie Conjetura de Ullman (en honor al matemático S. Ullman).
La conjetura consiste en lo siguiente:
1. Empieza con cualquier entero positivo (el que el usuario ha indicado por teclado).
2. Si el numero es par, se divide entre 2; se imprime, y se vuelve al punto 2, ahora a procesar el
nuevo numero obtenido
3. Si el numero es impar, se multiplica por 3 y se agrega le agrega 1. Se imprime, y se vuelve al
punto 2, ahora a procesar el nuevo numero obtenido
4. Se continua hasta obtener el número 1, momento en el que acaba la serie.
La susodicha serie confirma que, sea cual sea el numero inicial elegido, al final se obtendrá el
número 1.
Por ejemplo, cuando el entero inicial elegido por el usuario es 26, la secuencia que se ha de escribir
es esta:
26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
 */
public class E15Fav {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el numero");
        N= entrada.nextInt();
        System.out.print(N+" ");
        if (N>0){
            while (N!=1){
                if (N % 2 == 0) {
                    N = N / 2;
                } else {
                    N = N * 3 + 1;
                }
                System.out.print(N+" ");
            }
        }
    }
}



