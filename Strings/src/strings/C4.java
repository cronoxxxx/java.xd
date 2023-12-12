package strings;
/*
Colocar los elementos del String x a un arreglo, y de ese arreglo pasar la informacion a otro arreglo
 */
public class C4 {
    public static void main(String[] args) {
        String x="ABC tech";
        char[]y=x.toCharArray();
        System.out.println("Longitud del arreglo: "+y.length);
        char[]a= new char[y.length];
        for (int i=0; i<a.length;i++){
            a[i]=y[i];
        }
        System.out.println("Contenido del nuevo arreglo");
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}



