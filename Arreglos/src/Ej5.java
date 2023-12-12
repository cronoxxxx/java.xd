import java.util.Scanner;

public class Ej5 {
    /*
    Cargar un arreglo de nElementos y verificar posteriormente si el mismo está en forma creciente, decreciente, o desordenado (NO SE PERMITEN NEGATIVOS, SOLO POSITIVOS)
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int nElementos = 0;
        do {
            if (nElementos<0){
                System.err.println("Vuelva a digitar un numero positivo");
            }
            System.out.println("Ingrese el numero de elementos del array");
            nElementos= entrada.nextInt();
            
        } while (nElementos<0);

        boolean creciente= false;
        boolean decreciente= false;
        float [] arreglo= new float[nElementos];
        System.out.println("Guardando numeros");
        for (int i=0; i< arreglo.length; i++){
            do {
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]=entrada.nextFloat();
            if (arreglo[i]<0){
                System.err.println("Ingrese un numero mayor que 0");
            }
            } while (arreglo[i]<0);
        }

        for (int i=0; i< arreglo.length-1; i++){  // array de 4 // 2 3 5 1
            if (arreglo[i] > arreglo[i + 1]) { // 2 5
                decreciente = true;
            } else if (arreglo[i] < arreglo[i+ 1]) {
                creciente = true;
            }
        }
        System.out.println("\nEl arreglo es");
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }

        if (creciente && !decreciente){
            System.out.println("El arreglo es creciente");
        } else if(!creciente && decreciente){
            System.out.println("El arreglo es decreciente");
        } else if (creciente){
            System.out.println("El arreglo está desordenado");
        } else {
            System.out.println("El arreglo tiene valores iguales");
        }
    }
}
