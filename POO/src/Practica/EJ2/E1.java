package Practica.EJ2;

import java.util.Scanner;

public class E1 {
    public String saludo(String saludar) {
        String mensaje = "Hola " + saludar;
        return mensaje;
    }

    public static void main(String[] args) {
        E1 op = new E1();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto = entrada.next();
        String resultado = op.saludo(texto);
        System.out.println(resultado);
    }
}

