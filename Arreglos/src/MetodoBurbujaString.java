import java.util.Scanner;

public class MetodoBurbujaString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los elementos del arreglo");
        int elementos = entrada.nextInt();
        String [] nombres = new String[elementos];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Digite un nombre");
            nombres[i] = entrada.next(); // Alfonso, Antonio, Romero, Marcos, Rebeca, Alicia
        }

        System.out.println("\nARREGLO ORIGINAL");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        String aux;
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) { //Si una letra es mayor que otra (Romero-Marcos)
                    aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
            }
        }

        System.out.println("\nARREGLO ORDENADO"); //Alfonso, Alicia, Antonio, Marcos, Rebeca, Romero
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+" ");
        }
    }

}
