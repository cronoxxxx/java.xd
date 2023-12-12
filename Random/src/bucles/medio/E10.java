package bucles.medio;

import java.util.Scanner;

/*
Programa que pide por teclado cantidades y precios de varios productos. Se van a pedir estos datos
hasta que en la cantidad de un producto se indique 0. Al final indicar el total de la factura. Si el
importe supera los 1000€ se aplicará un descuento del 5%.
 */
public class E10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cantidad;
        double precio;
        double factura;
        double facturatotal = 0;
        double porcentajesuperior=0.5;
        double totalporc;
        do {
            do {
                System.out.println("Ingrese una cantidad de un producto");
                cantidad= entrada.nextInt();
                if (cantidad<0){
                    System.err.println("Cantidad invalida");
                }
            } while (cantidad<0);
            if (cantidad == 0) {
                break;
            }
            do {
                System.out.println("Ingrese su precio");
                precio= entrada.nextInt();
                if (precio<0){
                    System.err.println("Ingrese un precio valido");
                }
            } while (precio<0);
            factura=cantidad*precio;
            facturatotal+=factura;
        }while (true);
        if (facturatotal<=1000){
            System.out.println("La factura total es: "+facturatotal);
        } else {
            totalporc=facturatotal*porcentajesuperior;
            double descuento=facturatotal-totalporc;
            System.out.println("La factura total es 1000, y contiene un descuento de "+descuento);
        }

    }
}
