package ejercicios;
import java.io.IOException;
public class ej20 {
        public static void main(String[] args) throws IOException {
            System.out.println("Ingrese un texto (presione Ctrl+D para finalizar):");

            int c;
            while ((c = System.in.read()) != -1) {
                char caracter = (char) c;

                // Verificar si el caracter es una letra minúscula
                if (caracter >= 'a' && caracter <= 'z') {
                    // Convertir la letra minúscula a mayúscula
                    char mayuscula = (char) (caracter - 'a' + 'A');
                    System.out.print(mayuscula);
                } else {
                    // Mantener caracteres que no son letras minúsculas sin cambios
                    System.out.print(caracter);
                }
            }
        }
    }

