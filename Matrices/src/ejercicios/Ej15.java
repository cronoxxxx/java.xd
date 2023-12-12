package ejercicios;

import java.util.Scanner;

/*
Se desea saber la temperatura media trimestral de cuatro paises. Para ello se tiene como dato las temperaturas medias mensuales de dichos paises

Se debe ingresar el nombre del pais y seguidamente las tres temperaturas medias mensuales.
Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria

a- Cargar por teclado los nombres de los paises y las temperaturas medias mensuales
b- Imprimir los nombres de los paises y las temperaturas medias mesuales de las mismas
c- Calcular la temperatura media trimestral de cada pais
d- Imprimir los nombres de los paises y las temperaturas medias trimestrales
e- Imprimir el nombre del pais con la temperatura media trimestral mayor.
 */
public class Ej15 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String[]nombres= new String[4];
        float [][]temperaturas= new float[4][3];
        float [] totalTemperaturas=new float[4];
        float []total= new float[4];
        float maximo;
        String nombremaximo;

        System.out.println("BIENVENIDO AL PROGRAMA, POR FAVOR, INGRESE 4 PAISES Y LAS TEMPERATURAS DE 3 MESES:");
        /*
        a- Cargar por teclado los nombres de los paises y las temperaturas medias mensuales
         */
        for(int i=0; i<4; i++){
            System.out.println("Nombre del pais");
            nombres[i]= entrada.next();
        for(int j=0; j<3; j++){
            System.out.println("Temperatura "+(j+1)+" : ");
                temperaturas[i][j]= entrada.nextFloat();
            }
            System.out.println();
        }
        /*
        b- Imprimir los nombres de los paises y las temperaturas medias mesuales de las mismas
         */
        System.out.println("LAS 3 TEMPERATURAS MENSUALES DE CADA PAIS ES:");
        for(int i=0; i<4; i++) {
            System.out.println(nombres[i]);
            for (int j = 0; j < 3; j++) {
                System.out.print(temperaturas[i][j]+" ");
            }
            System.out.println();
        }
        /*
        c- Calcular la temperatura media trimestral de cada pais
        d- Imprimir los nombres de los paises y las temperaturas medias trimestrales
         */
        System.out.println("LA TEMPERATURA MEDIA TRIMESTRAL DE CADA PAIS ES");
        for(int i=0; i<4; i++){
            System.out.println(nombres[i]);
            for(int j=0; j<3; j++) {
                totalTemperaturas[i]+=temperaturas[i][j];
            }
            total[i]=totalTemperaturas[i]/3;
            System.out.println(total[i]);

            }
        System.out.println("EL PAIS CON LA MAYOR TEMPERATURA MEDIA ES:");
        maximo= total[0];
        nombremaximo=nombres[0];
        for (int i=0; i<4; i++){
            if (maximo<total[i]){
                maximo=total[i];
                nombremaximo= nombres[i];
            }

        }
        System.out.println("Pais: "+nombremaximo+", temperatura media: "+maximo);

        /*
        e- Imprimir el nombre del pais con la temperatura media trimestral mayor.
         */

    }
}
