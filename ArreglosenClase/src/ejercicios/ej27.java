package ejercicios;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
    27. El inventario de un almacén de 30 artículos deportivos se desea guardar  los siguientes datos: código del artículo y precio del mismo.
    Programa que realice lo siguiente en forma de menú:

        A. Imprimir todos los códigos de los artículos con su precio correspondiente:
        B. Buscar un artículo por código y decir su precio.
        C. Listar todos los códigos de las prendas más caras.
        D. Listar todos los códigos de las prendas más baratas.
        E. Ordenar las listas por código
        F. Borrar algún elemento por su código. Hay que hacer distinción entre si está ordenado por código o no lo está.
        G. Calcula las ganancias obtenidas sabiendo que se han vendido tantos productos como la posición que ocupan por el código del elemento de la posición contigua.
 */
public class ej27 {
    public static void main(String[] args) throws IOException {
        Scanner entrada= new Scanner(System.in);
        Random random= new Random();
        float []arreglo= new float[30];
        int numeroabuscar;
        int numeroeliminar;
        char opcion;
        int contador=0;
        float sumacontador=0;
        float aux;
        boolean xd;
        do {
            System.out.println("""
                    BIENVENIDO AL PROGRAMA, SELECCIONE ALGUNA DE LAS OPCIONES:
                            A. Imprimir todos los códigos de los artículos con su precio correspondiente:
                            B. Buscar un artículo por código y decir su precio.
                            C. Listar todos los códigos de las prendas más caras.
                            D. Listar todos los códigos de las prendas más baratas.
                            E. Ordenar las listas por código
                            F. Borrar algún elemento por su código. Hay que hacer distinción entre si está ordenado por código o no lo está.
                            G. Calcula las ganancias obtenidas sabiendo que se han vendido tantos productos como la posición que ocupan por el código del elemento de la posición contigua.
                            H. EXIT""");
            opcion = (char) System.in.read();

            switch (opcion) {
                case 'A':
                    for (int i = 0; i < arreglo.length; i++) {
                        arreglo[i] = random.nextFloat() * (100 - 1);
                        System.out.printf("Artículo: %d tiene el precio de %2.2f \n", (i+1), arreglo[i]);
                    }
                    System.out.println("ARTICULOS IMPRESOS");
                    break;
                case 'B':
                    boolean abuscar = true;
                    do {
                        System.out.println("Ingrese un numero a buscar en el arreglo");
                        numeroabuscar = entrada.nextInt();
                        for (int i = 0; i < arreglo.length; i++) {
                            if (i == numeroabuscar-1) {
                                abuscar = false;
                                System.out.println("PRECIO: "+arreglo[i] + " que estaba en la posición " + (i+1));
                            }
                        }
                    } while (abuscar);
                    break;
                case 'C':
                    for (int i=0; i<arreglo.length;i++){
                        contador++;
                        sumacontador+=arreglo[i];
                    }
                    float mediatotal=sumacontador/contador;
                    for (int i=0; i<arreglo.length;i++){
                        if (arreglo[i]>mediatotal){
                            System.out.printf("En la posición %d con el precio %2.2f \n", (i+1), arreglo[i]);

                        }
                    }
                    break;
                case 'D':
                    for (int i=0; i<arreglo.length;i++){
                        contador++;
                        sumacontador+=arreglo[i];
                    }
                    float mediatotal2=sumacontador/contador;
                    for (int i=0; i<arreglo.length;i++){
                        if (arreglo[i]<mediatotal2){
                            System.out.printf("En la posición %d con el precio %2.2f \n", (i+1), arreglo[i]);
                        }
                    }
                    break;
                case 'E':
                    for (int i=0; i<arreglo.length-1;i++){
                        do {
                            xd=false;
                            for (int j=0; j<arreglo.length-1;j++){
                                if (arreglo[j]>arreglo[j+1]){
                                    aux=arreglo[j];
                                    arreglo[j]=arreglo[j+1];
                                    arreglo[j+1]=aux;
                                    xd=true;
                                }
                            }
                        }while (xd);

                        for (i=0; i<arreglo.length;i++){
                            System.out.printf("Artículo: %d tiene el precio de %2.2f \n", (i+1), arreglo[i]);
                        }
                }
                    break;
                case 'F':
                    do {
                    System.out.println("Inserte la posicion de codigo que desee eliminar");
                    numeroeliminar= entrada.nextInt();
                    } while (numeroeliminar>30 || numeroeliminar<0);
                    arreglo[(numeroeliminar-1)] = 0;
                    for (int i=0; i<arreglo.length;i++){
                        System.out.println(arreglo[i]+" ");
                    }
                    break;
                case 'G':
                for (int i=0; i< arreglo.length;i++){
                    sumacontador+=arreglo[i];
                }
                    System.out.println("EL TOTAL DE VENTA ES: "+sumacontador);
                break;
            }

        } while (opcion !='H');
        }
    }

