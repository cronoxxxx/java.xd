import java.io.IOException;
import java.util.Scanner;

public class Ej7Repasar {
    /*
    Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas.
    Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas
    mayores de edad (mayores o iguales a 18 años)
     */
    public static void main(String[] args) throws IOException {
        Scanner entrada= new Scanner(System.in);
        char [][] personas= new char[5][50];
        int [] edades = new int[5];
        System.out.println("Guardando nombres");
        for (int i=0; i< personas.length; i++){
            System.out.println("Ingrese el nombre de la persona");
            int j = 0;
            char c;
            while ((c = (char) System.in.read()) != '\n' && c != '\r') {
                personas[i][j++] = c;
            }
            do {
                System.out.println("Ingrese la edad");
                edades[i] = entrada.nextInt();
                if (edades[i]<0){
                    System.err.println("Ingrese una edad válida");
                    break;
                }
            } while (edades[i]<0);
        }

        System.out.println("Las personas mayores de edad son: ");
        for (int i=0; i< personas.length; i++){
            if (edades[i]>=18){
                System.out.print("Nombre: ");
                for (int j = 0; j < personas[i].length; j++) {
                    char c = personas[i][j];
                    if (c == '\0') {
                        break;
                    }
                    System.out.print(c);
                }
                System.out.println(", Edad: " + edades[i]);
                /*System.out.println("Nombre: ");
                for (char c : personas[i]) {
                    if (c == '\0') {
                        break;
                    }
                    System.out.print(c);
                }
                System.out.println(", Edad: " + edades[i]);*/
            }
            }
        }
    }

