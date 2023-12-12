package ejercicios;

public class ej21 {

        public static void main(String[] args) throws java.io.IOException {
            System.out.println("Ingrese una cadena de caracteres:");

            // Leer la cadena de caracteres desde la entrada estándar
            char[] cadena = new char[100]; // Suponemos un límite máximo de 100 caracteres
            int longitudCadena = 0;
            int c;
            while ((c = System.in.read()) != '\n' && longitudCadena < 100) {
                char character = (char) c;
                cadena[longitudCadena++] = character;
            }

            System.out.println("Ingrese el número de caracteres que desea obtener:");

            // Leer el número de caracteres desde la entrada estándar
            int numCaracteres = 0;
            while ((c = System.in.read()) != '\n') {
                char character = (char) c;
                // Convertir el carácter numérico a valor entero
                int valorNumerico = character - '0';
                numCaracteres = numCaracteres * 10 + valorNumerico;
            }

            // Obtener la parte izquierda de la cadena
            if (numCaracteres > 0 && numCaracteres <= longitudCadena) {
                for (int i = 0; i < numCaracteres; i++) {
                    System.out.print(cadena[i]);
                }
                System.out.println(); // Agregar nueva línea al final
            } else {
                System.out.println("Número de caracteres inválido.");
            }
        }
    }

