import java.util.Scanner;

public class Ej9 {
    /*
    Crear un arreglo de n elementos y dado a ese arreglo, separar los elementos positivos y los negativos en
    diferentes arreglos
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos");
        int elementos= entrada.nextInt();
        int [] arregloprincipal= new int [elementos];
        for (int i=0; i< arregloprincipal.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arregloprincipal[i]=entrada.nextInt();
        }

        //Imprimir arreglo original
        for (int i=0; i< arregloprincipal.length; i++){
            System.out.print(arregloprincipal[i]+" ");
        }

        int [] positivos= new int[elementos];
        int [] negativos= new int[elementos];

        int posCount = 0;
        int negCount = 0;
        int ceroCount=0;

        for (int i=0; i< arregloprincipal.length; i++){
            if (arregloprincipal[i]>0){
                positivos[posCount]=arregloprincipal[i];
                posCount++;
            }
            if (arregloprincipal[i]<0){
                negativos[negCount]=arregloprincipal[i];
                negCount++;
            }
            if (arregloprincipal[i]==0){
                ceroCount++;
            }

        }
        System.out.println("\nEl arreglo de positivos es");
        for (int i=0; i< posCount; i++){
            System.out.print(positivos[i]+" ");

        }
        System.out.println("\nEl arreglo de negativos es");
        for (int i=0; i< negCount; i++){

            System.out.print(negativos[i]+" ");
        }

        System.out.println("\nLa cantidad de ceros es: "+ceroCount);


    }
}
