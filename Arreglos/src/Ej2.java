import java.util.Scanner;

public class Ej2 {
    /*
    Llenar un arreglo de 10 elementos de tipo float e imprimirlos en orden
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float []arreglo=new float[10];
        System.out.println("Guardando numeros...");
        for (int i=0; i< arreglo.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextFloat();
        }
        System.out.println("\nEl arreglo de float es:");
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
    }
}
