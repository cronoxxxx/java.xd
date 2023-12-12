package ejercicios;

import java.util.Scanner;

/*
    6. Hacer un programa que:
    1. Cree un array bidimensional de 10x5 y nombre “datos”
    2. Inicialice la matriz de forma que cada elemento guarde el número de fila a la que pertenece
    3. Muestre el contenido del array en pantalla
 */
public class ej6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[][]matriz=new int[10][5];
        System.out.println("GUARDANDO NUMEROS");
        for(int i=0; i<10;i++){
        for(int j=0; j<5;j++){
            System.out.println("Matriz["+(i+1)+"]["+(j+1)+"]");
            matriz[i][j]=entrada.nextInt();
            }
        }
        for(int i=0; i<10;i++){
            for(int j=0; j<5;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
