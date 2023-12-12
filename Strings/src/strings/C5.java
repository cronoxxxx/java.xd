package strings;
/*
De un string, pasarlo a un arreglo, y de ese arreglo, pasarlo a otro impreso al reves
 */
public class C5 {
    public static void main(String[] args) {
        String nombre="Adrian";
        char[]x=nombre.toCharArray();
        char[]a=new char[x.length];
        System.out.println("PALABRA ORIGINAL:");
        System.out.println(x);
        System.out.println("PALABRA REVERSA: ");
        //Pasamos el valor de y hasta a
        for (int i=0; i< x.length;i++){
            a[i]=x[i];
        }
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
