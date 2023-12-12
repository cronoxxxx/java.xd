import java.util.Scanner;

public class Ej3 {
    /*
    Definir un arreglo de n componentes de tipo float que representen las alturas de 5 personas. Obtener el promedio de las mismas. Contar cuantas personas
    son mas altas que el promedio y cuantas mas bajas
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a las que calcular la altura");
        int personas= entrada.nextInt();
        float []alturas= new float[personas];

        System.out.println("Guardando numeros");
        //Usamos do while para que el usuario no pueda escribir una nota que sea menor a 0, como -1,5
            for (int i=0; i< alturas.length; i++){
                do {
                System.out.println((i+1+". Ingrese la estatura de la persona"));
                alturas[i]= entrada.nextFloat();
                if (alturas[i]<0){
                    System.err.println("Estatura menor a 0, no válido. Ingrese un digito de nuevo");
                }
                } while (alturas[i]<0);
            }



        float suma=0;
        //Imprimimos el arreglo
        for (int i=0; i< alturas.length; i++){
            System.out.print(alturas[i]+" ");
            suma+= alturas[i];
        }
        float promedio= suma/alturas.length;
        System.out.println("\nEl promedio de todas las alturas es: "+promedio);

        //Ahora imprimimos a las personas mayor al promedio de la altura con un contador
        int contadoraltos=0;
        int contadorbajos=0;
        for (int i=0; i<alturas.length; i++){
            if (alturas[i]>promedio){
                contadoraltos++;
            }
            if (alturas[i]<promedio){
                contadorbajos++;
            }
        }
        System.out.println("La cantidad de personas mas altas que el promedio es: "+contadoraltos);
        System.out.println("La cantidad de personas bajas que el promedio es: "+contadorbajos);






    }
}
