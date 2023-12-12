package Practica.EJ15;


import java.util.Random;
import java.util.Scanner;

/*
Desarrolla un juego en el que el programa elija un número aleatorio y
el usuario tenga que adivinarlo. Proporciona pistas al usuario si su
conjetura es demasiado alta o demasiado baja.
 */
public class P1 {
    int[] array;
    int numero;
    int cantidad;

    public void declaracion() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Cuantos elementos desea en el array");
        cantidad = entrada.nextInt();
        array = new int[cantidad];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }

    public void encontrarNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero que desee buscar");
        int i;
        boolean encontrado;
        do {
            numero = entrada.nextInt();
            encontrado = false;
            for (i = 0; i < array.length; i++) {
                if (array[i] == numero) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("Numero encontrado con exito");
            } else {
                System.out.println("Numero no encontrado, intentelo de nuevo");
            }
        } while (!encontrado);

    }

    public static void main(String[] args) {
        P1 o1 = new P1();
        o1.declaracion();
        o1.encontrarNumero();
    }
}
