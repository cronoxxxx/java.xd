package bucles.inicial;

import java.util.Scanner;

/*

EJEMPLO 4: Hacer un programa que muestre un menú de este tipo:
"1.- Introducir nota"
"2.- Mostrar nota media"
"3.- Mostrar notas extremas"
"4.- Mostrar notas"
"0.- Salir"

De modo que si se opta por:
✤ la opción 1 pide por teclado una nueva nota, y se guarda en un array
✤ la opción 2 muestra la nota media de todas las introducidas hasta ese momento
✤ la opción 3 muestra la menor y la mayor de todas las notas introducidas hasta ese momento
✤ la opción 4 muestra todas las notas introducidas hasta ese momento
✤ la opción 0 acaba el programa

MEJORA 1: Al ejercicio anterior, añadirle una opción "5.- Eliminar nota” que nos pedirá un número,
y eliminara la nota que tenga en el array ese número como índice

 */
public class EXD {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿Cuantas notas desea ingresar?");
        int cantidadnota= entrada.nextInt();
        float[]notas= new float[cantidadnota];
        int opcion;
        float suma=0;
        int contador=0;
        do {
            System.out.println("\"1.- Introducir nota\"\n" +
                    "\"2.- Mostrar nota media\"\n" +
                    "\"3.- Mostrar notas extremas\"\n" +
                    "\"4.- Mostrar notas\"\n" +
                    "\"5.- Eliminar nota”\"\n"+
                    "\"0.- Salir\"");
            opcion= entrada.nextInt();
        switch (opcion) {
            case 1:
                for (int i=0; i<notas.length;i++){
                    do {
                        System.out.println((i+1)+". Ingrese una nota");
                        notas[i]= entrada.nextInt();
                        suma+=notas[i];
                        contador++;
                        if (notas[i]>10){
                            System.err.println("Introduzca una nota valida");
                        }
                    } while (notas[i]>10);
                }
                break;
            case 2:
                float notamedia=suma/contador;
                System.out.println("NOTA MEDIA: "+notamedia);
                break;
            case 3:
                //Burbuja
                float aux;
                for (int i=0; i<notas.length-1;i++){
                    for (int j = 0; j < notas.length - i - 1; j++) {
                        if (notas[j]>notas[j+1]){
                            aux=notas[j];
                            notas[j]=notas[j+1];
                            notas[j+1]=aux;
                        }
                    }
                }
                System.out.println("La menor nota es: "+notas[0]);
                System.out.println("La nota mayor es: "+notas[cantidadnota-1]);
                break;
            case 4:
                System.out.println("NOTAS MOSTRADAS: ");
                for (int i=0; i<notas.length;i++){
                    System.out.print(notas[i]+" ");
                }
                System.out.println();
                break;
            case 5:
                System.out.println("Ingrese la posicion de nota que desee eliminar");
                int notaeliminar= entrada.nextInt();
                for (int i=notaeliminar; i<notas.length-1;i++){
                    notas[i]=notas[i+1];
                    }
                System.out.println("ARREGLO RESULTANTE");
                for (int i=0; i<notas.length-1;i++){
                    System.out.print(notas[i]+" ");
                }
                System.out.println();
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.err.println("Ingrese una opcion valida");
                }
        }while (true);
        }
    }

