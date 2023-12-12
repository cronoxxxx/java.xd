public class EjemploString {
    public static void main(String[] args) {
        // Definir una cadena
        String cadena = "Hola, Mundo!";

        // Utilizar el método toCharArray() para convertir la xd en un array de caracteres
        char[] arrayDeCaracteres = cadena.toCharArray();

        // Imprimir cada caracter del array
        System.out.println("Caracteres en el array:");
        for (int i=0; i< arrayDeCaracteres.length; i++) {
            System.out.print(arrayDeCaracteres[i] + " ");
        }
    }
}
