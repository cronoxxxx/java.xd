package bucles.medio;

import java.util.Objects;
import java.util.Scanner;

/*
Hacer un programa que pide un número al usuario, y escribe en pantalla el mes correspondiente a tal
número (si el usuario introduce 2, el programa escribe “Febrero”). Si el numero no es válido, lo indica
igualmente. Tras ello, se le pregunta al usuario si quiere repetir, y si dice “si”, se vuelve a repetir el
proceso anterior
 */
public class E5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int mes;
        String respuesta;
        System.out.println("Ingrese un numero correspondiente a un mes (1-12)");
        do {
            mes=entrada.nextInt();
            if (mes==1){
                System.out.println("Es enero");
            } else if (mes==2){
                System.out.println("Es febrero");
            } else if (mes==3){
                System.out.println("Es marzo");
            } else if (mes==4){
                System.out.println("Es abril");
            } else if (mes==5){
                System.out.println("Es mayo");
            } else if (mes==6){
                System.out.println("Es junio");
            } else if (mes==7){
                System.out.println("Es julio");
            } else if (mes==8){
                System.out.println("Es agosto");
            } else if (mes==9){
                System.out.println("Es setiembre");
            } else if (mes==10){
                System.out.println("Es octubre");
            } else if (mes==11){
                System.out.println("Es noviembre");
            } else if (mes==12){
                System.out.println("Es diciembre");
            }

            if (mes<=0 || mes>12){
                System.out.println("Mes invalido, ¿desea repetir el proceso?(si/no)");
                entrada.nextLine();
                respuesta= entrada.nextLine();
                if (Objects.equals(respuesta, "si") || Objects.equals(respuesta, "SI")) {
                    System.out.println("Ingrese un numero correspondiente a un mes (1-12)");
                } else if (Objects.equals(respuesta, "no") || Objects.equals(respuesta, "NO")){
                    System.out.println("Saliendo del programa...");
                    break;
                }
            }
        } while (mes<=0 || mes>12);


    }
}
