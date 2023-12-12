package bucles.inicial;

import java.util.Random;

/*
Escribir un bucle que de 5 vueltas y que elige en cada vuelta un número al azar entre 1 y 100, y al
final nos dice si salieron mas pares que impares, o al revés
 */
public class E1 {
    public static void main(String[] args) {
        Random random= new Random();
        int n;
        int contadorpares=0;
        int contadorimpares=0;
        for (int i=0; i<5;i++){
            n= random.nextInt(1,101);
            System.out.print(n+" ");
            if (n%2==0){
                contadorpares++;
            } else {
                contadorimpares++;
            }
        }
        System.out.println();
        if (contadorpares>contadorimpares && contadorimpares>0){
            System.out.println("Hay mas pares que impares");
        }
        if (contadorpares<contadorimpares && contadorpares>0){
            System.out.println("Hay mas impares que pares");
        }
        if (contadorpares==0){
            System.out.println("Solo hay impares");
        }
        if (contadorimpares==0){
            System.out.println("Solo hay pares");
        }
    }
}
