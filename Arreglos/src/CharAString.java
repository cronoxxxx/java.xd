public class CharAString{
        public static void main(String[] args) {
            // Definir un array de caracteres
            char[] arrayDeCaracteres = {'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o', '!'};

            // Imprimir la longitud del array de caracteres
            System.out.println("Longitud del arrayDeCaracteres: " + arrayDeCaracteres.length);

            // Convertir el array de caracteres a String
            String cadena = new String(arrayDeCaracteres);

            // Imprimir la longitud de la cadena
            System.out.println("Longitud de la cadena: " + cadena.length());
            System.out.println(cadena);


            // Concatenar "de" a la cadena
            cadena = cadena + "penis";

            // Imprimir la longitud de la cadena después de la concatenación
            System.out.println("Longitud de la cadena después de concatenar 'penis': " + cadena.length());
            System.out.println(cadena);
        }
    }


