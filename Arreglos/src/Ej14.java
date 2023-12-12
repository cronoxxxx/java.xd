import java.util.Scanner;

public class Ej14 {
    /*
    Crea un programa que lea elementos a un array y terminar el programa
    cuando digites el -1, por ultimo mostrar el array
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int []arreglo= new int[1000];
        int i;
        int cont=0;
        boolean pause=false;

        do {
            for(i=0; i<1000;i++) {
                System.out.println((i+1)+". Ingrese el valor");
                arreglo[i]=entrada.nextInt();
                if(arreglo[i]==-1) {
                    pause=true;
                    break;
                }
                cont++;
            }

        } while (!pause);

        for ( i=0; i<cont; i++){
            System.out.print(arreglo[i]);
        }

    }
}
