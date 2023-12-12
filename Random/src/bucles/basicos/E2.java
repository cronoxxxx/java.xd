package bucles.basicos;
/*
Escribir todos los números, del -100 al 100, de 3 en 3.
 */
public class E2 {
    public static void main(String[] args) {
        for (int i=-100; i<=100;i+=3){
            System.out.print(i+" ");
            System.out.print(i+1+" ");
            System.out.println(i+2+" ");
        }
    }
}
