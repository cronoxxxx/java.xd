package CO3;

import java.util.Scanner;

public class Operacion2 {
    int n1,n2;
    int suma;
    int producto;
    int division;
    int resta;
    public void declaracion(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n1= entrada.nextInt();
        System.out.println("Ingrese otro");
        n2= entrada.nextInt();
    }
    public void sumar(){
        suma=n1+n2;
    }
    public void restar(){
        resta=n1-n2;
    }
    public void multiplicar(){
        producto=n1*n2;
    }
    public void dividir(){
        division=n1/n2;
    }

    public void salida(){
        System.out.println("La suma de dos numeros es: "+suma);
        System.out.println("La resta de dos numeros es: "+resta);
        System.out.println("La  multiplicacion de dos numeros es: "+producto);
        System.out.println("La division de dos numeros es: "+division);
    }

    public static void main(String[] args) {
        Operacion2 op= new Operacion2();
        op.declaracion();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.salida();
    }
}
