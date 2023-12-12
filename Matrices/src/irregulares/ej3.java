package irregulares;

import java.util.Scanner;

/*
Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la primer fila, 2 columnas la segunda fila, y asi sucesivamente hasta 5 columnas
la ultima fila (crearla sin la intervencion del operador) Realizar la carga por teclado e imprimir
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
    int[][]irregular=new int[5][];
    int contador=1;
    for(int i=0; i<irregular.length;i++){
        irregular[i]=new int[contador++];
        for(int j=0; j<irregular[i].length; j++){
        System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
        irregular[i][j]= entrada.nextInt();
        }
    }
    for (int i=0; i<irregular.length;i++){
        for(int j=0; j<irregular[i].length; j++){
            System.out.print(irregular[i][j]+" ");
        }
        System.out.println();
    }
    }
}
