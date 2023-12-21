package Practica;

import java.util.Scanner;

/*
EJERCICIO 2: Dados estos arrays
String [] nombreDeCadaAlumno = {"Luis","Jose","Carlos","Pedro","Juanjo"}
int[] notasDeCadaAlumno = {8,2,5,4,9};
Hacer un bucle que nos diga los nombres de los alumnos que han aprobado y su nota, esto es, debe dar como salida por pantalla:
"Luis ha aprobado con un 8"
"Carlos ha aprobado con un 5"
"Juanjo ha aprobado con un 9”
MEJORA 1: Crear los arrays vacíos y pedir los datos al usuario por teclado. Las notas pueden tener decimales. */
public class EJ18 {
    public static void main(String[] args) {
        String [] nombreDeCadaAlumno = {"Luis","Jose","Carlos","Pedro","Juanjo"};
        int[] notasDeCadaAlumno = {8,2,5,4,9};
        float[] nuevasNotas= new float[5];
        bucleNota(nombreDeCadaAlumno,notasDeCadaAlumno);
        nuevasNotas(nombreDeCadaAlumno,nuevasNotas);
    }
    public static String[] bucleNota(String[]alumnos, int[]notas){
        for (int i=0; i<5;i++){
            System.out.println("La nota de "+alumnos[i]+" es: "+notas[i]);
        }
        return alumnos;
    }

    public static String[] nuevasNotas(String[]alumnos, float[]nuevasNotas){
        Scanner entrada= new Scanner(System.in);
        for (int i=0; i<5;i++){
            do {
            System.out.println("Ingrese la nota del alumno "+alumnos[i]);
            nuevasNotas[i]= entrada.nextFloat();
            if (nuevasNotas[i]<0 || nuevasNotas[i]>10){
                System.err.println("Agrege una nota valida");
            }
            }while (nuevasNotas[i]<0 || nuevasNotas[i]>10);
        }

        for (int i=0; i<5;i++){
            if (nuevasNotas[i]>=5){
                System.out.println("La nota de "+alumnos[i]+" es: "+nuevasNotas[i]);
            }
        }
        return alumnos;
    }

}
