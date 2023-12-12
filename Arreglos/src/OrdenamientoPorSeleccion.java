import java.util.Scanner;

public class OrdenamientoPorSeleccion {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese el numero de elementos del arreglo");
    int nElementos= entrada.nextInt();
    int[]arreglo=new int[nElementos];
    for (int i=0; i< arreglo.length;i++){
        System.out.println((i+1)+". Ingrese un numero");
        arreglo[i]= entrada.nextInt();
    }
        System.out.println("\nARREGLO ORIGINAL");
    for (int i=0; i< arreglo.length;i++){
        System.out.print(arreglo[i]+" ");
    }
    int minimo;
    int aux;

    //METODO DE SELECCION
        for (int i=0; i< arreglo.length;i++){ //4-3-1-2-5
            minimo=i;
            for (int j=i+1; j<arreglo.length; j++){
                if (arreglo[j]<arreglo[minimo]){ //1RA 3<4 // 2DA 1<3 // 2<1; //5<1
                    minimo=j; //minimo =3 // minimo =1 // NO // NO = minimo=1
                }
            }
            aux=arreglo[i]; // aux=4
            arreglo[i]=arreglo[minimo]; // 4=1
            arreglo[minimo]=aux; //1=aux
        }
        System.out.println("\nARREGLO ORDENADO");
        for (int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" ");
        }
    }
}
