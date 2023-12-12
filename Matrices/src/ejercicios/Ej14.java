package ejercicios;

import java.util.Scanner;

/*
Se tiene la siguiente informacion:
.Nombres de 4 empleados
.Ingresos en concepto de sueldo, cobrado po cada empleado, en los ultimos tres meses

Confeccionar el programa para:
a) Realizar la carga de la informacion mencionada
b) Generar un vector que contenga el ingreso acumulado en sueldos en los tres ultimos meses para cada empleado
c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los ultimos 3 meses
d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
 */
public class Ej14 {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        String[] nombres = new String[4];
        int[][] sueldo = new int[4][3]; // Modificar la dimensión para almacenar sueldos de 3 meses
        int[] ingresoAcumulado = new int[4];
        int totalSueldos = 0;
        String empleadoMaxIngreso;
        int maximoIngreso;
        System.out.println("BIENVENIDO AL PROGRAMA, POR FAVOR, INGRESAR EL NOMBRE DE 4 EMPLEADOS Y LO QUE HA COBRADO CADA UNO EN LOS TRES ULTIMOS MESES:");
        for(int i=0; i<4; i++){
            System.out.println("Ingrese el nombre del empleado " + (i + 1));
            nombres[i] = entrada.next();
            for(int j=0; j<3; j++){
            do {
            System.out.println("Ingrese el sueldo");
            sueldo[i][j]= entrada.nextInt();
            if (sueldo[i][j]<0){
                System.err.println("Numero invalido, por favor, ingrese un sueldo valido");
            }
            }while (sueldo[i][j]<0);
            ingresoAcumulado[i] += sueldo[i][j];
            totalSueldos += sueldo[i][j];
            }
        }
        System.out.println("EL SUELDO DE LOS TRES EMPLEADOS LOS TRES ULTIMOS MESES SON: ");
        for(int i=0; i<4; i++){
            System.out.println("Nombre del empleado " + (i + 1) + ": " + nombres[i]);
            System.out.println("Ingreso acumulado del empleado: " + ingresoAcumulado[i]);
            System.out.println();
            }
        System.out.println("EL TOTAL DE LOS SUELDOS DE LOS TRES EMPLEADOS ES: "+totalSueldos);

        System.out.println("EL EMPLEADO CON MAYOR INGRESO ACUMULADO ES: ");
        maximoIngreso = ingresoAcumulado[0];
        empleadoMaxIngreso = nombres[0];

        for (int i = 0; i < 4; i++) {
            if (ingresoAcumulado[i] > maximoIngreso) {
                maximoIngreso = ingresoAcumulado[i];
                empleadoMaxIngreso = nombres[i];
            }
        }
        System.out.println(empleadoMaxIngreso+", sueldo: "+maximoIngreso);
        }
    }

