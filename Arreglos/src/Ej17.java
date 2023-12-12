import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[] arreglo1 = new int[12];
        int[] arreglo2 = new int[12];
        int[] arreglo3 = new int[24];
        System.out.println("PRIMER ARREGLO");
        for (int i=0; i<arreglo1.length; i++){
            System.out.println((i+1)+". Ingrese un numero");
            arreglo1[i]=entrada.nextInt();
        }
        System.out.println("\nSEGUNDO ARREGLO");
        for (int j=0; j<arreglo2.length; j++){
            System.out.println((j+1)+". Ingrese un numero");
            arreglo2[j]=entrada.nextInt();
        }
        int i;
        int j;
        int k=0;
        for (i=0; i<12; i+=3){
            for (j=0; j<3; j++){
                arreglo3[k]=arreglo1[i+j];
                k++;
            }
            for (j=0; j<3; j++){
                arreglo3[k]=arreglo2[i+j];
                k++;
            }
        }
        for (k=0; k< arreglo3.length;k++){
            System.out.print(arreglo3[k]+" ");
        }
    }
}
