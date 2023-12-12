package bucles.inicial;

import java.util.Scanner;

/*
Programa que pide por teclado números, de manera continua, hasta que se introducen dos números
iguales seguidos.
 */
public class E17 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeroAnterior = entrada.nextInt();
        int numeroActual;
        do {
            numeroActual = entrada.nextInt();
            if (numeroActual == numeroAnterior) {
                System.out.println("Has ingresado dos números iguales seguidos. El programa se detendrá.");
                break;
            }
        } while (true);
    }

}
