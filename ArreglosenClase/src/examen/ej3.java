package examen;

import java.util.Scanner;

/*
Programa que pide N al usuario y el numero que conformaran las siguientes piramides:

N=3 numero 2      N=3 numero=3      N=4 numero=2     N=4 numero=3
1                 1
1 2               1 3
1 2 4             1 3 9
hacer espejo de piramide sin repetir la ultima fila
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas ");
        int filas= entrada.nextInt();
        System.out.println("Ingrese el numero por el que se conformara la piramide");
        int numero= entrada.nextInt();
        for(int i=0; i<filas;i++){
            int numeroactual = 1;
            for (int j=1; j<=i; j++){
                System.out.print(numeroactual+" ");
                numeroactual*=numero;
            }
            System.out.println();
        }
        for(int i=filas-2; i>=0;i--){
            int numeroactual = 1;
            for (int j=1; j<i+1; j++){
                System.out.print(numeroactual+" ");
                numeroactual*=numero;
            }
            System.out.println();
        }
    }
}
