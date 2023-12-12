package bucles.medio;

public class E14Piramide {
    public static void main(String[] args) {
        int N=5;
        for (int i=0; i<N;i++){
            for (int j=0; j<N;j++){
                if (j<N-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i=0; i<N;i++){
            for (int j=N; j>0;j--){
                if (j<N-i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
