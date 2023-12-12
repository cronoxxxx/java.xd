import java.util.Random;

public class Ordenarxd {
    public static void main(String[] args) {
        int[]arreglo= new int[10];
        Random random= new Random();

        for(int i=0; i< arreglo.length;i++){
            arreglo[i]= random.nextInt(0,50);
        }
        System.out.println("ARREGLO ORIGINAL");
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
        int aux;
        int minimo;
        for(int i=0; i< arreglo.length; i++){
            minimo=i;
                for(int j=i+1; j< arreglo.length;j++){
                    if (arreglo[minimo]>arreglo[j]){
                        minimo=j;
                }
            }
            aux=arreglo[i];
            arreglo[i]=arreglo[minimo];
            arreglo[minimo]=aux;
        }
        System.out.println("\nARREGLO ORDENADO");
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }


    }
}
