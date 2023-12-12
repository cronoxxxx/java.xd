package manipulacion;
public class E2 {
    public static void main(String[] args) {
    String frase="Hoy es un estupendo dia para aprender a programa en Java";
        System.out.println(frase.length());
    String fraseResumen=frase.substring(0,3)+ " es un gran dia para morir y" + frase.substring(23,56);
        System.out.println(fraseResumen);
    }
}
