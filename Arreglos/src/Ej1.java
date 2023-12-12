import java.util.Scanner;

public class Ej1 {
    /*
    Llenar un arreglo de 5 elementos e imprimirlos en orden
     */
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Guardando numeros");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
