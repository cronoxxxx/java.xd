package CLASES.CO1.CO2;

import java.util.Scanner;

public class Operacion {
    //Atributos
    int n1;
    int n2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;

    //Metodos
    public void leerResultados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n1 = entrada.nextInt();
        System.out.println("Ingrese otro");
        n2 = entrada.nextInt();
    }

    public void suma() {
        sumar = n1 + n2;
    }

    public void resta() {
        restar = n1 - n2;
    }

    public void producto() {
        multiplicar = n1 * n2;
    }

    public void division() {
        dividir = n1 / n2;
    }

    public void mostrarResultados() {
        System.out.println("La suma de los dos numeros es: " + sumar);
        System.out.println("La resta de los dos numeros es: " + restar);
        System.out.println("La multiplicacion de los dos numeros es: " + multiplicar);
        System.out.println("La division de los dos numeros es: " + dividir);
    }

    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.leerResultados();
        op.suma();
        op.resta();
        op.producto();
        op.division();
        op.mostrarResultados();

    }
}
