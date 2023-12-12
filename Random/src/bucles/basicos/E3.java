package bucles.basicos;
/*
Escribir todos los números, del 100 al 0, de 7 en 7.
 */
public class E3 {
    public static void main(String[] args) {
        for (int i=100; i>=0;i--){
            System.out.print(i+" ");
            System.out.print(i-1+" ");
            System.out.print(i-2+" ");
            System.out.print(i-3+" ");
            System.out.print(i-4+" ");
            System.out.print(i-5+" ");
            System.out.println(i-6+" ");
        }
    }
}
