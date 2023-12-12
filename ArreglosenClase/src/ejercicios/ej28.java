package ejercicios;

import java.util.Random;
import java.util.Scanner;


public class ej28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Declarar variables
        int[][] huevosPorGallina = new int[20][15];
        int[] totalHuevosPorDia = new int[15];
        int[] totalHuevosPorGallina = new int[20];
        int j;
        int i;
        // Ingresar datos por teclado
        for (i = 0; i < 20; i++) {
            for ( j = 0; j < 15; j++) {
                huevosPorGallina[i][j] = random.nextInt(10) + 1;
                totalHuevosPorDia[j] += huevosPorGallina[i][j];
                totalHuevosPorGallina[i] += huevosPorGallina[i][j];
            }
        }

        for (i = 0; i < 20; i++) {
            for ( j = 0; j < 15; j++) {
                System.out.println("Gallina "+(i+1)+" en el dia "+(j+1)+": "+huevosPorGallina[i][j]);
            }
            }

        // Calcular medias
        double mediaHuevosPorDia = 0;
        for (i = 0; i < 15; i++) {
            mediaHuevosPorDia += totalHuevosPorDia[i];
        }
        mediaHuevosPorDia /= 15;

        double mediaHuevosPorGallina = 0;
        for (i = 0; i < 20; i++) {
            mediaHuevosPorGallina += totalHuevosPorGallina[i];
        }
        mediaHuevosPorGallina /= 20;

        // Mostrar resultados
        System.out.println("A. Media de huevos al día: " + mediaHuevosPorDia);
        System.out.println("B. Media de huevos por gallina: " + mediaHuevosPorGallina);

        // C. Identificar gallinas no rentables
        System.out.println("C. Gallinas no rentables (no ponen más de tres huevos al día):");
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 15; j++) {
                if (huevosPorGallina[i][j] < 3) {
                    System.out.println("Gallina "+(i+1)+" en el dia "+(j+1)+": "+huevosPorGallina[i][j]);
                }
            }
        }
        // D. Encontrar gallina que ha puesto más huevos un día específico
            System.out.print("D. Ingrese el número del día para encontrar la gallina que puso más huevos ese día: ");
            int diaSeleccionado = scanner.nextInt();
            if (diaSeleccionado < 1 || diaSeleccionado > 15) {
                System.out.println("Por favor, ingrese un número de día válido (entre 1 y 15).");
            } else {
                int gallinaMaxHuevos = -1;
                int maxHuevos = Integer.MIN_VALUE;
                for (i = 0; i < 20; i++) {
                    if (huevosPorGallina[i][diaSeleccionado - 1] > maxHuevos) {
                        maxHuevos = huevosPorGallina[i][diaSeleccionado - 1];
                        gallinaMaxHuevos = i;
                    }
                }
                System.out.println("La gallina que puso más huevos el día " + diaSeleccionado + " es la gallina " + (gallinaMaxHuevos + 1));
            }
        }
    }



