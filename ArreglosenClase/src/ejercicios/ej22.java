package ejercicios;

public class ej22 {
    public static void main(String[] args) {
        // Definir el array bidimensional de matrículas
        int[][] matriculas = {
                {35, 30, 32, 32, 34, 35, 34, 28},
                {40, 33, 40, 37, 36, 39, 40, 29},
                {25, 23, 26, 21, 24, 24, 25, 15},
                {33, 33, 33, 32, 34, 30, 32, 20},
                {45, 44, 45, 44, 43, 40, 44, 33},
                {24, 20, 22, 22, 24, 25, 24, 12}
        };

        // Definir el array bidimensional de asignaturas
        int[][] asignaturas = new int[8][8];

        // Calcular el total de alumnos matriculados por asignatura
        for (int i = 0; i < matriculas.length; i++) {
            for (int j = 0; j < matriculas[0].length; j++) {
                asignaturas[j][i] += matriculas[i][j];
            }
        }

        // Imprimir la tabla con el total de alumnos matriculados por asignatura
        System.out.printf("%-12s", "Asignatura");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.printf("%-1s", "Grupo " + (i + 1));
        }
        System.out.printf("%-5s%n", "Total");

        for (int i = 0; i < asignaturas[0].length; i++) {
            System.out.printf("%-15s", "Asignatura " + (i + 1));
            int total = 0;
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.printf("%-7s", asignaturas[j][i]);
                total += asignaturas[j][i];
            }
            System.out.printf("%-5d%n", total); // Imprimir el total directamente como un entero
        }
    }
}





