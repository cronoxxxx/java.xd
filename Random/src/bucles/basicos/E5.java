package bucles.basicos;

import java.util.Random;

public class E5 {
    /*
Escribir un bucle que de 5 vueltas y que elige en cada vuelta un número al azar entre 1 y 100, y al
final nos dice la suma de todos ellos
     */
    public static void main(String[] args) {
        Random random= new Random();
        int n;
        int suma = 0;
        for (int i=0; i<5;i++){
            n= random.nextInt(100)+1;
            System.out.print(n+" ");
            suma+=n;
        }
        System.out.println("SUMA TOTAL: "+suma);

    }
}
