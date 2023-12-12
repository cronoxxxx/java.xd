import java.util.Scanner;

public class OrdenamientoPorInsercion {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese el numero de elementos");
    int nElementos= entrada.nextInt();
    int[] numeros= new int[nElementos];
    for (int i=0; i< numeros.length; i++){
        System.out.println((i+1)+". Ingrese un numero");
        numeros[i]=entrada.nextInt();
    }
        System.out.println("ARREGLO ORIGINAL");
    for (int i=0; i<numeros.length; i++){
        System.out.print(numeros[i]+" ");
    }
    int posicion;
    int aux;

    for (int i=0; i<numeros.length;i++){ //4-8-9-2-3
        aux=numeros[i];
        posicion=i;
        while (posicion>0 && (numeros[posicion-1]>aux)){
            numeros[posicion]=numeros[posicion-1];
            posicion--;
            }
            numeros[posicion]=aux;
        }
        System.out.println("ARREGLO ORDENADO");
        for (int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
    }
    }

