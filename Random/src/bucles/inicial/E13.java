package bucles.inicial;
/*
Programa que escribe todos los números múltiplos de 4 menores de 100, pero en una sola línea,
separados por comas, pero sin que haya ultima coma tras el ultimo número
 */
public class E13 {
    public static void main(String[] args) {
        for (int i=0; i<100;i++){
            if (i%4==0){
                System.out.print(i);
                if (i<96){
                    System.out.print(", ");
                }
            }
        }
    }
}
