package ejercicios;
/*
    1. Hacer un programa que:
    1. Cree un array unidimensional de nombre “vector” y 15 elementos, siendo sus componentes de tipo numérico entero
    2. Cargar el array con valores aleatorios que sean introducidos por teclado
    3. Calcular la suma de los primeros N elementos almacenados en el array
    4. Muestre el resultado obtenido así como el contenido del array en pantalla
 */
public class ej1 {
    public static void main(String[] args) {
        int[]vector= new int[15];
        int sumaTotal=0;
        for (int i=0; i<15;i++){
            vector[i]=(int)(Math.random()*10);
            sumaTotal+=vector[i];
        }
        for (int i=0; i<15;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("La suma total de los numeros es: "+sumaTotal);
    }

}
