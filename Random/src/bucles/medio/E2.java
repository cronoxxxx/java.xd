package bucles.medio;

import java.util.Scanner;

/*
Programa que pide por teclado 5 números, y en el caso en el que el primero introducido sea igual al
último, nos muestra la media. En caso contrario, no se mostrará nada.
 */
public class E2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double numeroAntiguo= entrada.nextDouble();
        double numeroActual;
        double mediatotal;
        double suma=0;
        int contador=0;
        for (int i=0; i<4;i++){
            System.out.println("Ingrese otro numero");
            numeroActual=entrada.nextDouble();
            suma+=numeroActual;
            contador++;
            if (numeroActual==numeroAntiguo){
                mediatotal= (numeroAntiguo+suma)/(contador+1);
                System.out.println("La media total es: "+mediatotal);
                return;
            }
        }
    }
}
