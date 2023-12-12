package bucles.medio;

/*
Mostrar por pantalla todos los números primos que hay entre 1 y 200
 */
public class E12Fav {
    public static void main(String[] args) {
        System.out.println("Primos menores que 200: ");
        for (int i = 1; i <= 200; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.print(i+" ");
            }
        }
    }
}



