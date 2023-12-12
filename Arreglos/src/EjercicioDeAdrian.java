import java.util.Scanner;

public class EjercicioDeAdrian {
    //
    /*
    Hacer un array, se ordenen los numeros desde donde el usuario indice el numero
    EJEMPLO= 4 6 8 3 5 6 3 9 8 3 2 (EL USUARIO INSERTA EL NUMERO 5)
    ARREGLO= 3 4 6 8 5 6 3 9 8 3 2
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad del arreglo");
        int nElementos= entrada.nextInt();
        int[] arreglo= new int[nElementos];

        for (int i=0; i< arreglo.length; i++){
            System.out.println("Ingrese un numero");
            arreglo[i]=entrada.nextInt();
        }
        //ARREGLO ORIGINAL
        for (int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
        int auxiliar;
        System.out.println("Ingrese la posicion desde la cual quiere ordenar sus numeros anteriores");
        int elemento=entrada.nextInt();

        if (elemento >= 1 && elemento <= arreglo.length) {
            System.out.println("Tu posicion ha sido encontrada");

            // Ordenar los elementos antes de la posición indicada por el usuario
            for (int i = 0; i < elemento - 1; i++) {
                for (int j = i + 1; j < elemento-1; j++) {
                    if (arreglo[i] > arreglo[j]) {
                        // Intercambiar los elementos si están en el orden incorrecto
                        auxiliar = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = auxiliar;
                    }
                }
            }

            // Imprimir el arreglo ordenado
            System.out.println("Arreglo Ordenado:");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
        } else {
            System.out.println("La posición ingresada no es válida.");
        }
    }

}
