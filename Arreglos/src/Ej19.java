import java.util.Scanner;

public class Ej19 {
    /*
    Buscar un elemento en un array de nElementos o la cantidad que desea segun su posicion
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int nElementos=entrada.nextInt();
        int []arreglo= new int[nElementos];
        for(int i=0; i< arreglo.length;i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextInt();
        }
        System.out.println("\nARREGLO ORIGINAL");
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("\nIngrese la posicion de desea buscar");
        int posicion= entrada.nextInt();
        for (int i=0; i< arreglo.length; i++){
            if (arreglo[posicion-1]==arreglo[i]){
                System.out.println("\nEl arreglo que buscas es: "+arreglo[posicion-1]);
            }
        }
    }
}
//if array posicion = array i