package ejercicios;

public class Ej1 {
    public static void main(String[] args) {
        int[][] tri= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Guardando numeros...");
        for(int i=0; i< 3; i++){
        for(int j=0; j< 3; j++){
            System.out.print(tri[i][j]+" ");
            }
        }
    }


}
