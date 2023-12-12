package ejercicios;



/*
    5. Hacer un programa que:
    1. Cree un array bidimensional de 5x5 y nombre “diagonal”
    2. Inicialice la matriz de forma que los componentes pertenecientes a la diagonal de la matriz valgan 1 y el resto 0
    3. Muestre el contenido del array en pantalla
 */
public class ej5 {
    public static void main(String[] args) {
        int[][]diagonal=new int[5][5];
        for(int i=0; i<5;i++){
        for(int j=0;j<5;j++){
            if (i==j){
                diagonal[i][j]=1;
            }
            }
        }
        for(int i=0; i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.print(diagonal[i][j]+" ");
            }
            System.out.println();
            }
    }

}
