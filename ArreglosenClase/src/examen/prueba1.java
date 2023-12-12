package examen;

import java.io.IOException;

public class prueba1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese un texto: ");
        String output = "";
        char c;
        while ((c = (char) System.in.read()) != '\n') { //Leer hasta que se presione Enter
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    output += '*';
                    break;
                default:
                    output += c;
                    break;
            }
        }

        System.out.println("Texto con vocales reemplazadas por asteriscos: " + output);
    }
}
