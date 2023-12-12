package bucles.inicial;
/*
Hacer un programa que muestre el producto de los 10 primeros números impares positivos (no de los
impares menores de 10, sino de los primeros 10 números mayores que 0 que sean impares)
 */
public class E16 {

    public static void main(String[] args) {
        int N=1;
        int producto=1;
        for (int i=0; i<10;i++){
            System.out.print(N+" ");
            producto*=N;
            N= N+2;
        }
        System.out.println("PRODUCTO TOTAL: "+producto);
    }
}
