import java.util.Scanner;

public class Ej11 {
    /*
    Invierte un arreglo de n elementos
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int n= entrada.nextInt();
        int [] arreglo= new int[n];
        for (int i=0; i< arreglo.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo[i]= entrada.nextInt();
        }

        //Imprimimos el array
        System.out.println("\nEl array es: ");
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
        //Array inverso
        System.out.println("\nEl array inverso es:");
        for(int i=arreglo.length-1; i>=0; i--){
            System.out.print(arreglo[i]+" ");
        }
    }
}
