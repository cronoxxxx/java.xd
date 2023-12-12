package ejercicios;

import java.util.Random;


/*
    7. Hacer un programa que:
    1. Cree un array unidimensional de 30 elementos de tipo numérico entero y nombre ”números”
    2. Inicializar el array con valores +, - y nulos
    3. Contabilizar el número de valores +,- y nulos
    4. Mostrar en pantalla los resultados obtenidos
 */
public class ej7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]numeros=new int[30];
        int contadorpos = 0;
        int contadorneg = 0;
        int contadornull = 0;
        for(int i=0; i<30;i++){
            numeros[i]= random.nextInt(41)-20;
        }
        for(int i=0; i<30;i++){
            if (numeros[i]==0){
                contadornull++;
            } else if (numeros[i]>0){
                contadorpos++;
            } else {
                contadorneg++;
            }
        }

        System.out.println("MATRIZ ORIGINAL");
        for (int i=0; i<30;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("\nLa cantidad de numeros negativos es: "+contadorneg);
        System.out.println("La cantidad de numeros positivos es: "+contadorpos);
        System.out.println("La cantidad de numeros nulos (ceros) es: "+contadornull);
    }

}
