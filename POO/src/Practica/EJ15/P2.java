package Practica.EJ15;

import java.util.Random;
import java.util.Scanner;

public class P2 {
    public int buscarNumero(int[] array) {
        Scanner entrada = new Scanner(System.in);
        boolean encontrado;
        System.out.println("Ingresa el numero que quieras buscar");
        int i;
        int valorEncontrado = 0;
        do {
            encontrado = false;
            int n1 = entrada.nextInt();
            for (i = 0; i < array.length; i++) {
                if (array[i] == n1) {
                    encontrado = true;
                    valorEncontrado = array[i];
                    break;
                }
            }
            if (encontrado) {
                System.out.println("El numero ha sido encontrado");
            }
            if (!encontrado) {
                System.out.println("Sigue intentando");
            }
        } while (!encontrado);
        return valorEncontrado;
    }

    public static void main(String[] args) {
        P2 o2 = new P2();
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("¿Cuantos numeros quieres en el array?");
        int tamano = entrada.nextInt();
        int[] array = new int[tamano];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(tamano * 10) + 1;
        }
        o2.buscarNumero(array);
    }
}