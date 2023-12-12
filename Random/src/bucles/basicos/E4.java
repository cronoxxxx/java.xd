package bucles.basicos;
/*
Haz todas las tablas xd
 */
public class E4 {
    public static void main(String[] args) {
        int n=0;
        while(n<12){
            for (int i=0; i<=12;i++){
                int mult=n*i;
                System.out.println(n+"x"+i+"="+mult);
            }
            n++;
        }
    }
}
