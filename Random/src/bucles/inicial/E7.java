package bucles.inicial;

import java.util.Scanner;

/*
Programa que pide por teclado dos números, numNotas y numMinima.
• numNotas es el número de calificaciones que van posteriormente a pedir, y
• numMinima una nota mínima que se va a controlar luego.
Hacer un bucle que le pida a los usuarios todas la calificaciones, e indicar finalmente cuántas
calificaciones han igualado o superado la nota mínima antes mencionada.
 */
public class E7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el limite de notas");
        int numNotas= entrada.nextInt();
        System.out.println("Ingrese la nota minima aceptada");
        int numMinima= entrada.nextInt();
        int notasApedir;
        int contador = 0;
        for (int i=0; i<numNotas;i++){
            System.out.println("Ingrese la nota "+(i+1));
            notasApedir= entrada.nextInt();
            if (notasApedir>=numMinima){
                contador++;
            }
        }
        if (contador>0){
            System.out.println("Han habido "+contador+" notas que han superado o igualado la nota minima de "+numMinima);
        }
        if (contador==0){
            System.err.println("No hay ninguna nota que ha superado la nota minima de "+numMinima);
        }

    }
}
