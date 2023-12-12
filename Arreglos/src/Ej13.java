import java.util.Scanner;

public class Ej13 {
    /*
    Leer un arreglo de 10 elementos numericos enteros. Eliminar el elemento situado en la posicion dada que el usuario quiera eliminar
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[]arreglo= new int[5];
        System.out.println("Guardando numeros...");
        for (int i=0; i< arreglo.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextInt();
        }
        //Arreglo normal
        System.out.println("Arreglo antes");
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }

        System.out.println("Ingrese la posicion que desee eliminar");
        int elemento= entrada.nextInt();
        for (int i=elemento-1; i< arreglo.length-1; i++){ //Se quita un elemento, por lo que se resto -1
        arreglo[i]= arreglo[i+1];
        }
        //Arreglo eliminar
        System.out.println("Arreglo ahora");
        for (int i=0; i< arreglo.length-1; i++){
            System.out.print(arreglo[i]+" ");
        }

    }
}
