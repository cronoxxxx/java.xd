package bucles.inicial;

import java.util.Scanner;

/*
Realizar un programa que pida al usuario 10 números. Debe calcular el resultado de sumar los
números introducidos en posiciones pares.
 */
public class E18 {
    public static void main(String[] args) {
        int suma=0;
        int N;
        Scanner entrada= new Scanner(System.in);
        for (int i=1; i<=10;i++){
            System.out.println((i)+". Ingrese un numero");
            N= entrada.nextInt();
            if (i%2==0){
                suma+=N;
            }
            
        }
        System.out.println("Suma de numeros en posiciones pares: "+suma);
    }
}
