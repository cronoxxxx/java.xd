package ejercicios;
/*
    12. Hacer un programa que:
    1. Cree un array bidimiensional de 5x15 elementos de tipo entero y nombre “marco”
    2. Cargar el array con valores 0 y 1 de la siguiente forma
 */
public class Ej12 {
    public static void main(String[] args) {
    int[][]marco= new int[5][15];
        System.out.println("GUARDANDO NUMEROS...");
        for (int i=0;i< marco.length;i++){
            for (int j=0; j<marco[0].length;j++){
                if (i==0 || i== marco.length-1){
                    marco[i][j]=1;
                }
                if (j==0 || j==marco[0].length-1){
                    marco[i][j]=1;
                }
            }

        }
        for (int i=0;i< marco.length;i++){
            for (int j=0; j<marco[0].length;j++) {
                System.out.print(marco[i][j]+" ");
            }
            System.out.println();
            }
    }
}
