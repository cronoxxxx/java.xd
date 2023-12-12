package bucles.inicial;
/*
Escribir los primeros 20 números seguidos, tanto con un FOR, con un WHILE y con DO WHILE
MEJORA 1: cada lista se deber mostrar en una sola línea, separados los números por comas
 */
public class E6 {
    public static void main(String[] args) {
        for (int i=0; i<20;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        int j=0;
        while (j<20){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
        int k=0;
        do {
            System.out.print(k+" ");
            k++;
        }while (k<20);
        System.out.println();
    }
}
