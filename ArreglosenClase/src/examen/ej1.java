package examen;

import java.io.IOException;
import java.util.Scanner;

/*
Los alumnos de 1DAM del IES Francisco de Quevedo son los encargados de la gestion de la
oficina de correos del distrito de San Blas

Para ello deben realizar un program que pueda ser utilizado por dos tipos de usuario,
el cliente y el trabajador de corros. El cliente utilizará el programa para obtener el
ticket de envio o recogida de paquetes. El trabajador utilizará el programa para ver cuantos
paquetes se han enviado y recogido desde qu arrqanco el programa

Para ello el programa presentara un menu
1. Cliente
2. Trabajador
3.Salir

Si el usuario introduce 1, el programa le mostrará las opciones:
A Enviar
B Recoger
C Salir (el programa volvera al menu anterior)

Si el usuario introduce 2 el programa le mostrará directamente el numero de paquetes
enviados, el numeros de paquetes recogidos así como el % que representa cada uno respecto
del total. Los menús se mostrarán hasta que el usuario introduzca una opcion correcta y solo
si introduce la opcion 3 se parará el programa

En la opcion A, el programa le mostrará al usuario un codigo que sera "ENV001" o "ENV002",
siendo el numero incrementado cada vez que se genere un ticket de envio de paquete. En la
opcion B, el programa le mostrara al usuario un codigo que sera "REC001" O "REC002" siendo
el numero incrementado cada vez que se genere un ticket de recogida de paquete
 */
public class ej1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int paquetesEnviados = 0;
        int paquetesRecogidos = 0;

        while (true) {
            System.out.println("1. Cliente");
            System.out.println("2. Trabajador");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            int opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    // Cliente
                    while (true) {
                        System.out.println("A. Enviar");
                        System.out.println("B. Recoger");
                        System.out.println("C. Salir");

                        System.out.print("Seleccione una opción: ");
                        char opcionCliente = (char)System.in.read();
                        while (System.in.read() != 10) ;
                        switch (opcionCliente) {
                            case 65:
                                paquetesEnviados++;
                                System.out.println("Código de envío: ENV" + (paquetesEnviados));
                                break;
                            case 66:
                                paquetesRecogidos++;
                                System.out.println("Código de recogida: REC" + (paquetesRecogidos));
                                break;
                            case 67:
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }

                        if (opcionCliente == 67) {
                            break;
                        }
                    }
                    break;

                case 2:
                    // Trabajador
                    System.out.println("Número de paquetes enviados: " + paquetesEnviados);
                    System.out.println("Número de paquetes recogidos: " + paquetesRecogidos);

                    double totalPaquetes = paquetesEnviados + paquetesRecogidos;

                    if (totalPaquetes > 0) {
                        double porcentajeEnviados = (paquetesEnviados / totalPaquetes) * 100;
                        double porcentajeRecogidos = (paquetesRecogidos / totalPaquetes) * 100;

                        System.out.print("Porcentaje de paquetes enviados: ");
                        System.out.printf("%.2f%%\n", porcentajeEnviados);

                        System.out.print("Porcentaje de paquetes recogidos: ");
                        System.out.printf("%.2f%%\n", porcentajeRecogidos);
                    } else {
                        System.out.println("Aún no hay paquetes enviados o recogidos.");
                    }
                    break;

                case 3:
                    // Salir del programa
                    System.out.println("Programa finalizado.");
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
