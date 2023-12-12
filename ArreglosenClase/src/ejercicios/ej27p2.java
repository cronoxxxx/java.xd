package ejercicios;

import java.io.IOException;

public class ej27p2 {

    public static void main(String[] args) throws IOException {
        int n = 30; // Número de artículos
        char[] codigos = new char[n];
        double[] precios = new double[n];

        // Inicializar datos de prueba
        for (int i = 0; i < n; i++) {
            codigos[i] = (char) ('A' + i);
            precios[i] = 10 + i * 5;
        }

        char opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("A. Imprimir todos los códigos de los artículos con su precio correspondiente");
            System.out.println("B. Buscar un artículo por código y decir su precio");
            System.out.println("C. Listar todos los códigos de las prendas más caras");
            System.out.println("D. Listar todos los códigos de las prendas más baratas");
            System.out.println("E. Ordenar las listas por código");
            System.out.println("F. Borrar algún elemento por su código");
            System.out.println("G. Calcular las ganancias obtenidas");
            System.out.println("X. Salir");

            System.out.print("\nSeleccione una opción: ");
            opcion = (char) System.in.read();
            System.in.read(); // Leer el carácter de nueva línea

            switch (opcion) {
                case 'A':
                    // Imprimir todos los códigos de los artículos con su precio correspondiente
                    for (int i = 0; i < n; i++) {
                        System.out.println("Código: " + codigos[i] + ", Precio: " + precios[i]);
                    }
                    break;

                case 'B':
                    // Buscar un artículo por código y decir su precio
                    System.out.print("Ingrese el código del artículo: ");
                    char codigoBuscado = (char) System.in.read();
                    System.in.read(); // Leer el carácter de nueva línea
                    int indice = -1;
                    for (int i = 0; i < n; i++) {
                        if (codigos[i] == codigoBuscado) {
                            indice = i;
                            break;
                        }
                    }
                    if (indice != -1) {
                        System.out.println("Precio del artículo " + codigoBuscado + ": " + precios[indice]);
                    } else {
                        System.out.println("Artículo no encontrado");
                    }
                    break;

                case 'C':
                    // Listar todos los códigos de las prendas más caras
                    double precioMaximo = precios[0];
                    for (int i = 1; i < n; i++) {
                        if (precios[i] > precioMaximo) {
                            precioMaximo = precios[i];
                        }
                    }
                    System.out.println("Códigos de las prendas más caras:");
                    for (int i = 0; i < n; i++) {
                        if (precios[i] == precioMaximo) {
                            System.out.println(codigos[i]);
                        }
                    }
                    break;

                case 'D':
                    // Listar todos los códigos de las prendas más baratas
                    double precioMinimo = precios[0];
                    for (int i = 1; i < n; i++) {
                        if (precios[i] < precioMinimo) {
                            precioMinimo = precios[i];
                        }
                    }
                    System.out.println("Códigos de las prendas más baratas:");
                    for (int i = 0; i < n; i++) {
                        if (precios[i] == precioMinimo) {
                            System.out.println(codigos[i]);
                        }
                    }
                    break;

                case 'E':
                    // Ordenar las listas por código
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (codigos[j] > codigos[j + 1]) {
                                // Intercambiar códigos
                                char tempCodigo = codigos[j];
                                codigos[j] = codigos[j + 1];
                                codigos[j + 1] = tempCodigo;

                                // Intercambiar precios correspondientes
                                double tempPrecio = precios[j];
                                precios[j] = precios[j + 1];
                                precios[j + 1] = tempPrecio;
                            }
                        }
                    }
                    System.out.println("Listas ordenadas por código");
                    break;

                case 'F':
                    // Borrar algún elemento por su código
                        System.out.print("Ingrese el código del artículo a borrar: ");
                    char codigoBorrar = (char) System.in.read();
                    System.in.read(); // Leer el carácter de nueva línea
                    int indiceBorrar = -1;
                    for (int i = 0; i < n; i++) {
                        if (codigos[i] == codigoBorrar) {
                            indiceBorrar = i;
                            break;
                        }
                    }
                    if (indiceBorrar != -1) {
                        for (int i = indiceBorrar; i < n - 1; i++) {
                            codigos[i] = codigos[i + 1];
                            precios[i] = precios[i + 1];
                        }
                        n--; // Decrementar el tamaño del arreglo
                        System.out.println("Artículo borrado con éxito");
                    } else {
                        System.out.println("Artículo no encontrado");
                    }
                    break;

                case 'G':
                    // Calcular las ganancias obtenidas
                    double ganancias = 0;
                    for (int i = 0; i < n; i++) {
                        ganancias += precios[i] * (i + 1); // Se han vendido tantos productos como la posición que ocupan
                    }
                    System.out.println("Ganancias obtenidas: " + ganancias);
                    break;

                case 'X':
                    // Salir del programa
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 'X');
    }
}
