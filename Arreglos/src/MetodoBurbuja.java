import java.util.Scanner;

public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int elementos= entrada.nextInt();
        boolean flag;
        int [] array= new int[elementos];
        System.out.println("GUARDANDO NUMEROS...");
        for (int i=0; i< array.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            array[i]= entrada.nextInt();
        }
        System.out.println("ARREGLO ORIGINAL:");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        //Metodo burbuja
        int aux;
        for (int i=0; i< array.length-1; i++){
            do {
                flag=false;
                for (int j=0; j< array.length-1; j++){
                    if (array[j]>array[j+1]){
                        aux=array[j];
                        array[j]=array[j+1];
                        array[j+1]=aux;
                        flag=true;
                    }
                }
            }while(flag);
        }
        System.out.println("\nARREGLO ORDENADO");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
