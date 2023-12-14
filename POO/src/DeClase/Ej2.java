package DeClase;

import java.util.Scanner;

/*
Ejercicio 2
Definir una clase OperacionesString con los siguientes métodos:
    • Método que devuelva las iniciales del nombre y los apellidos;
    • Método que devuelva la concatenación de dos String en mayúsculas
    • Método que me diga cuántas palabras hay en un String
    • Método que me diga cuántas veces aparece un String dentro de otro.
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre= entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        String apellidos= entrada.nextLine();
        iniciales(nombre,apellidos);
        aMayusculas(nombre,apellidos);
        contarLetras(nombre,apellidos);
        contarPalabras(nombre,apellidos);
        contarApariciones(nombre,apellidos);
    }





    private static String iniciales(String nombre, String apellidos){
        String nuevaCadena1="";
        String[]palabras1=nombre.split("\\s");
        for (int i=0; i<palabras1.length;i++){
            nuevaCadena1+=palabras1[i].charAt(0)+" ";
        }
        System.out.println("Iniciales de nombres: "+nuevaCadena1);

        ////////////////

        String nuevaCadena2="";
        String[] palabras2=apellidos.split("\\s");
        for (int i=0; i<palabras2.length;i++){
            nuevaCadena2 += palabras2[i].charAt(0)+" ";
        }
        System.out.println("Iniciales de apellidos: "+nuevaCadena2);
        return nuevaCadena2;
    }




    private static String aMayusculas(String nombre, String apellidos){
        nombre=nombre.toUpperCase();
        apellidos=apellidos.toUpperCase();
        String concat= nombre+" "+apellidos;
        System.out.println(concat);
        return concat;
    }





    private static String contarLetras(String nombre, String apellidos) {
        int contadorLetras1=0;
        String[]palabra1=nombre.split("\\s");
        for (int i=0; i<palabra1.length;i++){
            contadorLetras1+=palabra1[i].length();
        }
        System.out.println("Hay "+contadorLetras1+" letras respecto a los nombres");




        //CUENTA LAS LETRAS DE UN STRING
        String[] palabra2=apellidos.split("\\s");
        int contarLetras2=0;
        for (int i=0; i<palabra2.length;i++){
            contarLetras2+= palabra2[i].length();
        }
        System.out.println("Hay "+contarLetras2+" letras respecto a los apellidos");
    return nombre;
    }





    private static int contarPalabras(String nombre, String apellidos){
        int contarPalabras=0;
        String[]palabras=nombre.split("\\s");
        for (int i=0; i<palabras.length;i++){
            contarPalabras++;
        }
        System.out.println("Hay " + contarPalabras + " palabras en los nombres");
        //CUENTA LAS PALABRAS DE UN STRING
        int contarPalabras2 = 0;
        String[] palabras2 = apellidos.split("\\s");
        for (int i = 0; i < palabras2.length; i++) {
            contarPalabras2++;
        }
        System.out.println("Hay " + contarPalabras2 + " palabras en los apellidos");
        return contarPalabras2;
    }




    private static String contarApariciones(String nombre, String apellidos) {
        int contarRepetidos=0;
        String []palabras1=nombre.split("\\s");
        for (int i=0; i<palabras1.length;i++){
            String palabraActual=palabras1[i].toLowerCase();
            for (int j=0; j<i;j++){
                if (palabraActual.equals(palabras1[j].toLowerCase())){
                    contarRepetidos++;
                }
            }
        }
        System.out.println("Hay "+contarRepetidos+" nombres repetidos");

        int contarRepetidos2 = 0;
        String[] palabras2 = apellidos.split("\\s");
        for (int i = 0; i < palabras2.length; i++) {
            String palabraActual2 = palabras2[i].toLowerCase();
            for (int j = 0; j < i; j++) {
                if (palabraActual2.equals(palabras2[j].toLowerCase())) {
                    contarRepetidos2++;
                    break;
                }
            }
        }
        System.out.println("Hay "+contarRepetidos2+" apellidos repetidos");
        return nombre;
    }

}
