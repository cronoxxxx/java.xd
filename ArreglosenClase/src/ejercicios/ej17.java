package ejercicios;

import java.io.IOException;

/*
Hacer un programa que permita entrar un texto, contar el número de palabras que hay. No debe limitarse a contar los espacios en blanco ya que entre palabra
y palabra puede haber más de uno.
 */




public class ej17 {
    public static void main(String[] args) throws IOException {
        System.out.println("Por favor, ingrese un texto:");
        int count = 0;
        boolean isWord = false;
        while (true) {
            char c = (char) System.in.read();
            if (c == ' ' || c == '\r' || c == '\t') {
                if (isWord) {
                    count++;
                    isWord = false;
                }
            } else if (c == (char) -1 || c == '\n') {
                // Break the loop when encountering EOF or newline
                if (isWord) {
                    count++;
                }
                break;
            } else {
                isWord = true;
            }
        }
        System.out.println("El número de palabras en el texto ingresado es: " + count);
    }
}


