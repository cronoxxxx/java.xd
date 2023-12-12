import java.io.IOException;
import java.util.Scanner;

public class Ej12Repasar {
    /*
    Crear un programa que guarde 10 nombres de personas con sus dichas alturas, luego indicar la mayor
    y menor altura con sus dichos nombres
     */
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        char[][] personas = new char[10][150];
        float[] alturas = new float[10];
        System.out.println("Guardando nombres");
        for (int i = 0; i < personas.length; i++) {
            System.out.println((i + 1) + ". Ingrese el nombre de la persona");
            int j = 0;
            char c;
            while ((c = (char) System.in.read()) != '\n' && c != '\r') {
                personas[i][j++] = c;
            }
            do {
                System.out.println("Ingrese la altura");
                alturas[i] = entrada.nextFloat();
                if (alturas[i] < 0) {
                    System.err.println("Ingrese una altura válida");
                    break;
                }
            } while (alturas[i] < 0);
        }


        System.out.println("Guardando nombres y alturas: ");
        for (int i = 0; i < personas.length; i++) {
            if (alturas[i] > 0) {
                System.out.print("Nombre: ");
                for (int j = 0; j < personas[i].length; j++) {
                    char c = personas[i][j];
                    if (c == '\0') {
                        break;
                    }
                    System.out.print(c);
                }
                System.out.println(", Altura: " + alturas[i]);
            }
        }

        float maxAltura = alturas[0];
        float minAltura = alturas[0];
        int[] indicesMax = new int[10]; // assuming a maximum of 10 persons
        int[] indicesMin = new int[10]; // assuming a maximum of 10 persons
        int maxCount = 1;
        int minCount = 1;

        for (int i = 0; i < personas.length; i++) {
            if (alturas[i] > maxAltura) {
                maxAltura = alturas[i];
                indicesMax[0] = i;
                maxCount = 1;
            } else if (alturas[i] == maxAltura) {
                indicesMax[maxCount++] = i;
            }

            if (alturas[i] < minAltura) {
                minAltura = alturas[i];
                indicesMin[0] = i;
                minCount = 1;
            } else if (alturas[i] == minAltura && i != indicesMin[0]) {
                indicesMin[minCount++] = i;
            }
        }

        System.out.println("Personas con mayor altura: ");
        for (int i = 0; i < maxCount; i++) {
            System.out.print("Nombre: ");
            for (int j = 0; j < personas[indicesMax[i]].length; j++) {
                char c = personas[indicesMax[i]][j];
                if (c == '\0') {
                    break;
                }
                System.out.print(c);
            }
            System.out.println(", Altura: " + maxAltura);
        }

        System.out.println("Personas con menor altura: ");
        for (int i = 0; i < minCount; i++) {
            System.out.print("Nombre: ");
            for (int j = 0; j < personas[indicesMin[i]].length; j++) {
                char c = personas[indicesMin[i]][j];
                if (c == '\0') {
                    break;
                }
                System.out.print(c);
            }
            System.out.println(", Altura: " + minAltura);
        }

        }
    }


