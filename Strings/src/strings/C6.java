package strings;
/*
Crear un programa de String con palindromo
 */
import java.util.Scanner;

public class C6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String a= entrada.next();
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
