import java.util.Scanner;

public class Ej6 {
    /*
    Crear un arreglo de 10 elementos enteros y contar los elementos negativos, positivos, pares e impares
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int []elementos= new int [10];
        int contadornegativos=0;
        int contadorpositivos=0;
        int contadorpares=0;
        int contadorimpares=0;
        System.out.println("Guardando numeros");
        for (int i=0; i<elementos.length; i++){
            do {
                System.out.println((i+1)+". Ingrese un numero");
                elementos[i]= entrada.nextInt();
                if (elementos[i]==0){
                    System.err.println("No se valen ceros. Inserte otro numero");
                }
            } while (elementos[i]==0);

        }
        System.out.println("\n El arreglo es: ");
        for (int i=0; i<elementos.length; i++){
            System.out.print(elementos[i]+" ");
        }

        for (int i=0; i<elementos.length; i++){
            if (elementos[i]%2==0){
                contadorpares++;
            } else {
                contadorimpares++;
            }
            if (elementos[i]>0){
                contadorpositivos++;
            } else {
                contadornegativos++;
            }
        }

        System.out.println("La cantidad de numeros pares es: "+contadorpares);
        System.out.println("La cantidad de numeros impares es: "+contadorimpares);
        System.out.println("La cantidad de numeros positivos es: "+contadorpositivos);
        System.out.println("La cantidad de numeros negativos es: "+contadornegativos);
    }
}
