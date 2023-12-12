package bucles.medio;

import java.util.Scanner;

/*
Programa que pide por teclado al usuario 6 números positivos comprendidos entre el 10 y 50, ambos
inclusive. En el caso en el que algún número introducido no se encontrara dentro del rango de 10 a 50,
se mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando se hayan
introducido 6 números válidos y mostrará el número máximo introducido de los 6 válidos. Además
indicará cuántos números de los introducidos no han sido válidos.
 */
public class E8Fav {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;
        int nMaximo = 0;
        boolean primerNumeroValido = false;
        int nMinimo = 0;
        int contadorinvalidos = 0;
        System.out.println("Ingrese un numero");
        for (int i = 0; i < 6; i++) {
            do {
                N = entrada.nextInt();
                if (N < 10 || N > 50) {
                    System.err.println("Ingrese un numero valido");
                    contadorinvalidos++;
                } else {
                    if (!primerNumeroValido) { //BOOLEANO DE MINIMOS (MEMORIZAR)
                        nMinimo = N;
                        primerNumeroValido = true;
                    }
                    System.out.println("Introduzca otro numero");

                }
            } while (N < 10 || N > 50);
            if (N > nMaximo) {
                nMaximo = N;
            }
            if (N < nMinimo) {
                nMinimo = N;
            }
        }
        if (contadorinvalidos == 0) {
            System.out.println("Todos los numeros introducidos son válidos");
        } else if (contadorinvalidos > 0) {
            System.out.println("Ha habido " + contadorinvalidos + " numeros invalidos");
        }

        System.out.println("El numero maximo de los validos es: " + nMaximo);
        System.out.println("El numero minimo de los valores es: " + nMinimo);
    }
}
