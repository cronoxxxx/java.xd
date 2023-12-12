import java.util.Scanner;
/*
Crear un arreglo de n elementos y dado a ese arreglo separar los elementos pares e impares en diferentes
arreglos
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos");
        int n=entrada.nextInt();
        int []arregloprincipal= new int[n];
        int []pares= new int[n];
        int []impares= new int[n];
        for (int i=0; i< arregloprincipal.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arregloprincipal[i]= entrada.nextInt();
        }
        int contadorpares=0;
        int contadorimpares=0;
        for (int i=0; i< arregloprincipal.length; i++){
            if (arregloprincipal[i]%2==0){
                pares[contadorpares]= arregloprincipal[i];
                contadorpares++;
            } else {
                impares[contadorimpares]=arregloprincipal[i];
                contadorimpares++;
            }
        }

        //Imprimir el arreglo principal
        System.out.println("\nEl arreglo es:");
        for (int i=0; i<arregloprincipal.length; i++){
            System.out.print(arregloprincipal[i]+" ");
        }

        //Imprimir el arreglo de pares
        System.out.println("\nEl arreglo de pares es:");
        for (int i=0; i<contadorpares; i++){
            System.out.print(pares[i]+" ");
        }
        //Imprimir el arreglo de impares
        System.out.println("\nEl arreglo impares es:");
        for (int i=0; i<contadorimpares; i++){
            System.out.print(impares[i]+" ");
        }
    }
}
