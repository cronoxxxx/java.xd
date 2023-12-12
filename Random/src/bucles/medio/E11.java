package bucles.medio;

import java.util.Scanner;

/*
Realizar un programa que pida por teclado al usuario dos números, que serán el numerador y el
denominador de una fracción. Reducir luego la fracción a su mínima expresión, y escribir la fracción
resultante. Por ejemplo, si se escriben 24 y 30, debe escribir “Fracción reducida: 4/5”.
 */
public class E11 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int maximo=0;
        int numeradorreducido;
        int denominadorreducido;
        System.out.println("Ingrese un numerador");
        int numerador= entrada.nextInt();
        System.out.println("Ingrese un denominador");
        int denominador= entrada.nextInt();
         //30/24 == 5/4
            for (int i=1;i<numerador;i++){
                if (denominador%i==0 && numerador%i==0){
                    if (i>maximo){
                        maximo=i;
                    }
                }
            }
            numeradorreducido=numerador/maximo;
            denominadorreducido=denominador/maximo;
        System.out.println("Fracción reducida: "+numeradorreducido+"/"+denominadorreducido);


    }
}
