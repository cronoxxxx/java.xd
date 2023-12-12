import java.util.Scanner;

public class Ej19Solucion2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int nElementos=entrada.nextInt();
        int []arreglo= new int[nElementos];
        boolean flag=false;
        for(int i=0; i< arreglo.length;i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextInt();
        }
        System.out.println("\nARREGLO ORIGINAL");
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("\nIngrese la digito dento del array que desea buscar");
        int posicion= entrada.nextInt();
        for (int i=0; i< arreglo.length; i++){
            if (posicion==arreglo[i]){
                System.out.println("\nEl elemento ha sido encontrado en la posicion "+(i+1)+" del array");
                flag=true;
            }
        }
        if (!flag){
            System.err.println("El elemento no fue encontrado dentro del array");
        } else {
            System.out.println(" ");
        }
    }
}
