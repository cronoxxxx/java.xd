package bucles.inicial;

import java.util.Scanner;

/*
Realizar un programa que simula el control de acceso a una caja fuerte. La combinación será el
numero 4455. El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará
el mensaje “Lo siento, esa no es la combinación”, y si acertamos se nos dirá “La caja fuerte se ha
abierto satisfactoriamente”, terminando el programa. El programa también termina si no acertamos
en las cuatro oportunidades que hay para abrir la caja fuerte. //te quedan tantos intentos cada vez que sale mal
 */
public class E20 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la combinacion correcta para abrirla la caja, tienes 4 intentos");
        int N;
        for (int i=4; i>=1;i--){
            N= entrada.nextInt();
            if (N==4455){
                System.out.println("La cafa fuerte se ha abierto satisfactoriamente");
                return;
            } else {
                System.err.println("Lo siento, esa no es la combinación, te quedan "+(i-1)+" intentos");
                if (i==1){
                    System.err.println("Fin de la partida");
                }
            }

        }
    }
}
