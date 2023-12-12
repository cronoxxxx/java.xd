import java.util.Scanner;

public class Ej16 {
    /*
    Mezclar 2 arreglos de tipo String de 15 elementos en un tercer arreglo con un total de 30 elementos
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String [] array1= new String[15];
        String [] array2= new String[15];
        String [] array3= new String[30];
        System.out.println("PRIMER ARREGLO");
        for (int i=0; i<array1.length; i++){
            System.out.println((i+1)+". Ingrese una palabra");
            array1[i]= entrada.next();
        }
        System.out.println("SEGUNDO ARREGLO");
        for (int i=0; i<array2.length; i++){
            System.out.println((i+1)+". Ingrese una palabra");
            array2[i]= entrada.next();
        }
        int k=0;
        for (int i=0; i<array1.length; i++){
            array3[k]=array1[i];
            k++;
        }
        for (int j=0; j<array2.length; j++){
            array3[k]=array2[j];
            k++;
        }
        for (k=0; k< array3.length; k++){
            System.out.println(array3[k]+" ");
        }
    }
}
//mientras i < 10 y j< 10
// arreglo3[k]= arreglo1[i]