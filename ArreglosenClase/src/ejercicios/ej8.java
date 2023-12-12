package ejercicios;

import java.util.Random;

/*
    8. Hacer un programa que:
    1. Lea una secuencia de 20 valores numéricos reales y los almacene en un array de nombre “números”
    2. Muestra en pantalla cuál es el valor máximo, así como la posición que ocupa en el array. En el caso de aparecer repetido mostrará sólo el de menor índice
 */
public class ej8 {
    public static void main(String[] args) {
        Random random= new Random();
        int pos = 0;
        int[]numeros=new int[20];
        for (int i=0; i<20;i++){
            numeros[i]= random.nextInt(41)-20;
        }
        System.out.println("ARREGLO");
        for (int i=0; i<20;i++) {
            System.out.print(numeros[i]+" ");
        }
        int maximo=numeros[0];

        for (int i=0; i<20;i++) {
            if (maximo<numeros[i]){
                maximo=numeros[i];
                pos=i;
            }

        }
        System.out.println("El valor maximo es: "+maximo+" en la posicion "+(pos+1));
        }
        }


