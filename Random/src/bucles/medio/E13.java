package bucles.medio;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int contador=1;
        int suma=0;
        for (int i=1; i<=contador;i++){
            System.out.println((i)+". Ingrese un numero");
            int numero= entrada.nextInt();
            if (numero==0){
                contador--;
                break;
            } else {
                suma=suma+numero;
                contador++;
            }
        }
        int media=suma/contador;
        System.out.println("La media de "+contador+" numeros es: "+media);

    }
}
