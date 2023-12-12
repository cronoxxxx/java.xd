import java.util.Scanner;

/*
Calcular el promedio de dos arreglos de 10 elementos e indicar el promedio mayor
 */
// Calcular el promedio de cada arreglo, e indicar si el arreglo 1 es mayor que el arreglo 2 en promedio, o viceversa
public class Ej4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float []arreglo1= new float[10];
        float []arreglo2= new float[10];
        float sumaprimero=0;
        float sumasegundo=0;
        for (int i=0; i<arreglo1.length; i++){
            System.out.println((i+1)+". Ingrese un numero del primer arreglo");
            arreglo1[i]= entrada.nextFloat();

        }
        System.out.println();
        for (int i=0; i<arreglo2.length; i++){
            System.out.println((i+1)+". Ingrese un numero del segundo arreglo");
            arreglo2[i] = entrada.nextFloat();
        }
        System.out.println("\nEl primer arreglo es:");
        for (int i=0; i<arreglo1.length; i++){
            System.out.print(arreglo1[i]+" ");
            sumaprimero+=arreglo1[i];
        }
        System.out.println("\nEl segundo arreglo es:");
        for (int i=0; i<arreglo2.length; i++){
            System.out.print(arreglo2[i]+" ");
            sumasegundo+=arreglo2[i];
        }
        System.out.println();
        float promedioarreglo1= sumaprimero/arreglo1.length;
        float promedioarreglo2= sumasegundo/arreglo2.length;
        System.out.println("El promedio del arreglo es: "+promedioarreglo1);
        System.out.println("El promedio del arreglo es: "+promedioarreglo2);

        if (promedioarreglo1==promedioarreglo2) {
            System.out.println("Ambos arreglos tienen el mismo promedio");
        } else if ((promedioarreglo1>promedioarreglo2)){
            System.out.println("El promedio del primer arreglo es mayor");
        } else {
            System.out.println("El promedio del segundo arreglo es mayor");
        }

    }

}
