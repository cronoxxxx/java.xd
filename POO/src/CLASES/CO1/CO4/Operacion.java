package CLASES.CO1.CO4;

import java.util.Scanner;

public class Operacion {
    public int sumar(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }

    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }

    public int producto(int numero1, int numero2){
        int multiplicar=numero1*numero2;
        return multiplicar;
    }

    public int dividir(int numero1, int numero2){
        int division=numero1/numero2;
        return division;
    }

    public void resultados(int suma, int resta, int multiplicar, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicar);
        System.out.println("La division es: "+division);

    }

    public static void main(String[] args) {
        Operacion op2= new Operacion();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1= entrada.nextInt();
        System.out.println("Ingrese otro");

        //METODO 1:
        int numero2= entrada.nextInt();
        int suma=op2.sumar(numero1,numero2);
        int resta = op2.restar(numero1,numero2);
        int multiplicar=op2.producto(numero1,numero2);
        int division=op2.dividir(numero1,numero2);

        op2.resultados(suma, resta, multiplicar, division);

        //METODO 2:
        System.out.println("La suma es: "+op2.sumar(numero1,numero2));
        System.out.println("La resta es: "+op2.restar(numero1,numero2));
        System.out.println("El producto es; "+op2.producto(numero1,numero2));
        System.out.println("La division es: "+op2.dividir(numero1,numero2));

    }

}
