package bucles.inicial;

import java.util.Scanner;

/*
Pedir por teclado 10 sueldos. Mostrar su suma y cuántos hay mayores de 500€
 */
public class E5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int sueldo;
        int suma=0;
        int contador=0;
        for (int i=0; i<10;i++){
            do {
                System.out.println("Ingrese sueldo "+(i+1));
                sueldo= entrada.nextInt();
                suma+=sueldo;
            } while (sueldo<0);
            if (sueldo>500){
                contador++;
            }
        }
        System.out.println("La suma de los sueldos es: "+suma);

        if (contador==0){
            System.err.println("Son sueldos menores a 500 todos");
        }
        if (contador>0){
            System.out.println("SUELDOS MAYORES A 500: "+contador);
        }
    }
}
