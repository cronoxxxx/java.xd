package bucles.medio;

import java.util.Scanner;

/*
Pedir números por teclado hasta que se teclee un 0, mostrar la suma y la media de todos los números
introducidos.
 */
public class E1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese numeros y el programa finaliza cuando se coloca un 0," +
                "mostrando la media y la suma de todos los numeros contenidos");
        int N;
        int suma=0;
        int contador=0;
        int media;
        do {
            N= entrada.nextInt();
            suma+=N;
            contador++;
            media=suma/contador;
            System.out.println("Ingrese otro numero");
        }while (N!=0);
        System.out.println("La suma de todos los numeros es: "+suma);
        System.out.println("La media de todos los numeros es: "+media);
    }
}
