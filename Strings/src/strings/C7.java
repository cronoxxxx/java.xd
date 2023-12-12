package strings;

import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String a= entrada.nextLine();
        //Reemplazar todos los espacios
        a=a.replaceAll("\\s ","");
        //Agregar la validacion a mayusculas y minusculas pasando todas a mayusculas
        a=a.toUpperCase();
        char []x=a.toCharArray();
        int tamano= x.length;
        char[]y=new char[tamano];
        boolean esPalindromo=false;
        for (int i=0; i<tamano;i++){
            y[i]=x[i];
        }
        for (int i=0; i<tamano/2;i++){
            if (y[i]==y[tamano-1-i]){
                esPalindromo=true;
            } else {
                esPalindromo=false;
            }
        }
        if (esPalindromo){
            System.out.println("Es una palabra palindroma");
        } else {
            System.err.println("No es una palabra palindroma");
        }
    }
}
