import java.util.Scanner;
public class Ej18 {
    /*
    Crear un programa que llene un array con 10 numeros enteros que se leen por teclado. A continuacion calcula y muestra la media de los valores pares e impares
     */
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    int[]arreglo= new int[10];
        System.out.println("GUARDANDO NUMEROS...");
    for (int i=0; i< arreglo.length; i++){
        System.out.println((i+1)+". Ingrese un numero");
        arreglo[i]= entrada.nextInt();
    }
        System.out.println("ARREGLO ORIGINAL:");
        for (int i=0; i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
    int sumapares=0;
    int sumaimpares=0;
    int contadorpares=0;
    int contadorimpares=0;
    for (int i=0; i< arreglo.length; i++){
        if (arreglo[i]%2==0){
            sumapares+=arreglo[i];
            contadorpares++;
        } else {
            sumaimpares+=arreglo[i];
            contadorimpares++;
        }
    }
    int mediapares= sumapares/contadorpares;
    int mediaimpares= sumaimpares/contadorimpares;
        System.out.println("\nLa media de los numeros pares es: "+mediapares);
        System.out.println("La media de los numeros impares es: "+mediaimpares);
    }
}
