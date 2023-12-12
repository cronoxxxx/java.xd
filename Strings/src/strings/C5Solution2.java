package strings;

/*
De un string, pasarlo a un arreglo, y de ese arreglo, pasarlo a otro impreso al reves
 */

public class C5Solution2 {
    public static void main(String[] args) {
        String nombre="Adrian";
        char[]x=nombre.toCharArray();
        char[]a= new char[x.length];
        for (int i=0; i< x.length;i++){
            a[x.length-1-i]=x[i];
        }
        System.out.println(x);
        System.out.println(a);

    }
}
