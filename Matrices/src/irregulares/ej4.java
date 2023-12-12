package irregulares;

import java.util.Scanner;

/*
Hallar el elemento mediano, mayor y menor de una matriz irregular
 */
public class ej4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas= entrada.nextInt();
        int columnas;
        int[][] irregular= new int[filas][];
        int sumaTotal=0;
        int contador=0;

        for(int i=0; i<irregular.length;i++){
            System.out.println("Ingrese la cantidad de columnas de la fila "+(i+1));
                columnas= entrada.nextInt();
            irregular[i]=new int[columnas];
        for(int j=0; j<irregular[i].length;j++){
            System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
            irregular[i][j]=entrada.nextInt();
            }
        }
        System.out.println("MATRIZ:");
        for(int i=0; i<irregular.length;i++){
            for (int j=0; j<irregular[i].length;j++){
                System.out.print(irregular[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<irregular.length;i++){
            for (int j=0; j<irregular[i].length;j++){
                sumaTotal+=irregular[i][j];
                contador++;
            }
            System.out.println();
        }
        float mediaTotal= (float) sumaTotal /contador;
        System.out.println("LA MEDIA DE LA MATRIZ ES: "+mediaTotal);

        int nMaximo= irregular[0][0];
        int nMinimo= irregular[0][0];
        for(int i=0; i<irregular.length;i++){
            for (int j=0; j<irregular[i].length;j++) {
                if (nMaximo<irregular[i][j]){
                    nMaximo=irregular[i][j];
                }

            }
            }
        System.out.println("EL NUMERO MAXIMO DE LA MATRIZ ES: "+nMaximo);
        for(int i=0; i<irregular.length;i++){
            for (int j=0; j<irregular[i].length;j++) {
                if (nMinimo>irregular[i][j]){
                    nMinimo=irregular[i][j];
                }

            }
        }
        System.out.println("EL NUMERO MAXIMO DE LA MATRIZ ES: "+nMinimo);

    }
    }

