package irregulares;

import java.util.Scanner;

/*
Confeccionar una clase para administrqar los dias que han faltado los 3 empleados de una empresa.
Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los dias que han faltado cada empleado
(cargar el numero de dia que falto)
Cada fila de la matriz representan los dias de cada empleado
Mostrar los empleadas con la cantidad de inasistencias
Cual empleado falto menos dias
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String[]empleados= new String[3];
        String [][]dias= new String[3][];
        int diasfaltados;
        int [][]limitedias= new int[3][];
        int []contador=new int[3];
        int empleadoMinimo= 0;

        System.out.println("GUARDANDO DATOS...");
        System.out.println("BIENVENIDO AL PROGRAMA DEL 2023, POR FAVOR INGRESE LA FECHA EN QUE 3 EMPLEADOS FALTARON");
        for(int i=0; i< dias.length;i++){
            System.out.println("Ingrese el nombre del empleado "+(i+1));
            empleados[i]=entrada.next();
            System.out.println("¿Cuantos dias falto el empleado "+(i+1)+"?");
            diasfaltados= entrada.nextInt();
            dias[i]=new String [diasfaltados];
            limitedias[i]=new int[diasfaltados];
        for(int j=0; j<dias[i].length;j++){
            do {
                System.out.println("Dia faltado del mes, numero "+(j+1)+":");
                limitedias[i][j]= entrada.nextInt();
                System.out.println("Mes que falto");
                dias[i][j]= entrada.next();
                if (limitedias[i][j]<0 || limitedias[i][j]>31){
                    System.err.println("Numero no correspondido en el mes, agregue otro");
                }
            } while (limitedias[i][j]<0 || limitedias[i][j]>31);
            }
        }
        System.out.println("DIAS FALTADOS POR CADA EMPLEADO");
        for(int i=0; i<dias.length; i++){
            System.out.println("Nombre del empleado: "+empleados[i]);
            System.out.println("Los dia que falto: ");
        for(int j=0; j<dias[i].length; j++){
            System.out.println(limitedias[i][j]+" de "+dias[i][j]);
            contador[i]++;
            }
            System.out.println();
        }

        for(int i=0; i<dias.length; i++){
            System.out.println("LA CANTIDAD DE INASISTENCIAS DEL EMPLEADO "+(i+1)+" son:");
            System.out.println("Nombre del empleado: "+empleados[i]);
            System.out.println(contador[i]);
        }

        for (int i = 1; i < dias.length; i++) {
            if (contador[i] < contador[empleadoMinimo]) {
                empleadoMinimo = i;
            }
        }
        System.out.println("El empleado que ha faltado menos es: " + empleados[empleadoMinimo] +
                ", con solo " + contador[empleadoMinimo] + " inasistencias");
        }



    }

