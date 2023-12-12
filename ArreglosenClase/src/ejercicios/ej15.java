package ejercicios;

import java.io.IOException;


/*
Hacer un programa que permita entrar una serie de caracteres en una tabla hasta que se pulse ENTER;
controlar que no se pueda entrar más caracteres que el número de elementos del array. Después recorre el array y sustituir las vocales por asteriscos.
 */
public class ej15 {
    public static void main(String[] args) throws IOException {
        char []letras = new char [50];
        System.out.println("Escribe");
        for (int i = 0;  i < letras.length && letras[i]!=10;) {
            letras[i] = (char) System.in.read();
            if (letras[i]!=10) {
                i++;
            }
        }
        for (int i = 0; i <letras.length && letras[i]!=10; i++) {
            if (letras[i]==97||letras[i]==101||letras[i]==105||letras[i]==111||letras[i]==117||letras[i]==65||
                    letras[i]==69||letras[i]==73||letras[i]==79||letras[i]==85) {
                letras[i] = 42;
            }
        }
        for (int i = 0; i < letras.length && letras[i]!=10;) {
            System.out.print(letras[i]);
            if (letras[i]!=10) {
                i++;
            }
        }
    }
}
