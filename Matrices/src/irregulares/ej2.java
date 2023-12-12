package irregulares;

import java.util.Scanner;

/*
Confeccionar un programa que permita crear una matriz irregular y luego imprimir la matriz en forma completa, esta matriz tendra datos de tipo String
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas= entrada.nextInt();
        int columnas;
        String[][]irregular=new String[filas][];
        System.out.println("GUARDANDO NUMEROS...");
        for (int i=0; i<irregular.length;i++){
            System.out.println("Ingrese la cantidad de columnas para la fila "+(i+1));
            columnas=entrada.nextInt();
            irregular[i]=new String[columnas];
            for (int j=0; j<irregular[i].length;j++){
                System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
                irregular[i][j]= entrada.next();
            }
        }
        for (int i=0; i<irregular.length;i++){
            for (int j=0; j<irregular[i].length;j++){
                System.out.print(irregular[i][j]+" ");
            }
            System.out.println();
        }
    }
}
