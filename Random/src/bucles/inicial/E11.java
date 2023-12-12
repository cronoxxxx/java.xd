package bucles.inicial;

import java.util.Scanner;

/*
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído
por teclado.
 */
public class E11 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese hasta que numero quiere sacar multiplos de 3");
        int n2= entrada.nextInt();
        int suma=0;
        System.out.println("NUMEROS MULTIPLOS DE 3 DESDE EL 1 HASTA "+n2);
        for (int i=1; i<n2;i++){
            if (i%3==0){
                System.out.print(i+" ");
                suma+=i;
            }
        }
        System.out.println();
        System.out.println("Suma total de todos los multiplos de 3 desde 1 hasta "+n2+" :"+suma);
    }
}
