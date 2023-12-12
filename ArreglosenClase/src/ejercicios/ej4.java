package ejercicios;
/*
    4. Hacer un programa que:
    1. Cree un array bidimensional de 10x10
    2. Inicialice la matriz de forma que las filas pares se rellenen a uno y las impares a cero
    3. Una vez inicializada la matriz, muestre su contenido en pantalla
 */
public class ej4 {
    public static void main(String[] args) {
        int[][]matriz= new int[10][10];
        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){
                matriz[i][j]=(int)(Math.random()*50);
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++) {
                if (matriz[i][j]%2==0){
                    matriz[i][j]=1;
                } else {
                    matriz[i][j]=0;
                }
            }
        }
        System.out.println("MATRIZ REEMPLAZADA POR UNOS Y CEROS");
        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
            }
    }
}
