package bucles.inicial;

import java.util.Scanner;

/*
EJERCICIO 2: Realiza un programa que gestione un array ordenado ascendentemente y con un máximo de 10
elementos. Se permiten repetidos:
Menú:
1.Introducir número entero.
2.Listar números.
3.Listar numeros en forma ascendente
4. Eliminar numero
5.Eliminar todos los números.
6.Salir.
 */
public class EXD2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea imprimir?");
        int numero = entrada.nextInt();
        int[] arreglo = new int[numero];
        int opcion;
        do {
            System.out.println("\n" +
                    "1.Introducir número entero.\n" +
                    "2.Listar números.\n" +
                    "3.Listar numeros en forma ascendente\n" +
                    "4. Eliminar numero por posicion\n" +
                    "5.Eliminar todos los números.\n" +
                    "6.Salir.");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println((i + 1) + ". Introduce un numero");
                        arreglo[i] = entrada.nextInt();
                    }
                    break;
                case 2:
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.print(arreglo[i] + " ");
                    }
                    break;
                case 3:
                    int aux;
                    //BURBUJA
                    for (int i = 0; i < arreglo.length - 1; i++) {
                        for (int j = 0; j < arreglo.length - 1; j++) {
                            if (arreglo[j] > arreglo[j + 1]) {
                                aux = arreglo[j];
                                arreglo[j] = arreglo[j + 1];
                                arreglo[j + 1] = aux;
                            }
                        }
                    }
                    System.out.println("ARREGLO ORDENADO: ");
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.print(arreglo[i] + " ");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese un numero que desea eliminar (por su posicion)");
                    int posicioneliminar = entrada.nextInt();
                    if (posicioneliminar < 0 || posicioneliminar >= arreglo.length) {
                        System.out.println("La posición ingresada está fuera de los límites del arreglo.");
                    } else {
                        // Shift elements to the left to remove the element at posicioneliminar
                        for (int j = posicioneliminar-1; j < arreglo.length - 1; j++) {
                            arreglo[j] = arreglo[j + 1];
                        }
                        System.out.println("ARREGLO AHORA");
                        for (int j = 0; j < arreglo.length - 1; j++) {
                            System.out.print(arreglo[j]+" ");
                        }
                    }
                    break;
                case 5:
                    System.out.println("NUMEROS ELIMINADOS");
                    for (int i = 0; i < arreglo.length; i++) {
                        arreglo[i] = 0;
                    }
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.print(arreglo[i] + " ");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    return;
                default:
                    System.err.println("Insertar una opcion valida");
                    break;
            }
        } while (true);
    }
}
