public class LastIndexOf {
    public static void main(String[] args) {
        String texto = "¡Hola, mundo! ¡Hola, universo!";
        System.out.println("Tamaño del string: "+texto.length());
        int fromIndex = 20; // Índice de inicio para la búsqueda
        int lastIndex = texto.lastIndexOf("mundo", fromIndex); //Desde 3
        System.out.println("Último índice: " + lastIndex); //Hasta el ultimo (30)
    }
}
