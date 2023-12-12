import java.util.Scanner;

public class Ej8 {
    /*
        Cargar un arreglo de n elementos, imprimir el menor y un mensaje si se repite dentro del arreglo
         */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos");
        int elementos= entrada.nextInt();
        int []arreglo= new int[elementos];

        for (int i=0; i<elementos; i++){
            System.out.println((i+1)+". Ingrese un elemento");
            arreglo[i]= entrada.nextInt();

        }

        int aux= arreglo[0];
        int contadormenor=0;

        for (int i=0; i<elementos; i++){
            if (aux>arreglo[i]){ //5-6-7
                aux=arreglo[i];

            }
        }

        for (int i = 0; i <arreglo.length; i++) {
            if (aux == arreglo[i]) {
                contadormenor++;
            }
        }

        //Imprimir el arreglo
        System.out.println("El arreglo es: ");
        for (int i=0; i<elementos; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("\nEl numero es: "+aux);
        System.out.println("El numero se repitio "+contadormenor+" veces");

    }
}
