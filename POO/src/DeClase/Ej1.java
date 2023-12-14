package DeClase;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n= entrada.nextInt();
        System.out.println("Ingrese otro numero");
        int m= entrada.nextInt();
        PoDoA1(n);
        PoDoA2(m);
        esAmigo(n,m);
        esMuO(n,m);

    }
    private static int PoDoA1 (int n){
        int contador=0;
        for(int i=1; i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
                contador++;
            }
        }
        if (contador==2){
            System.out.println("\nEs un numero primo, su suma es equivalente a 1");
        } else {
            int sumadetectar=0;
            for(int i=1; i<n;i++){
                if(n%i==0){
                    sumadetectar+=i;
                }
            }
            if (sumadetectar<n){
                System.out.println("Es un numero defectivo");
            } else if (sumadetectar==n){
                System.out.println("Es un numero perfecto");
            } else {
                System.out.println("Es un numero abundante");
            }
        }
        return n;
    }
    private static int PoDoA2 (int m){
        int contador=0;
        for(int i=1; i<=m;i++){
            if (m%i==0){
                System.out.print(i+" ");
                contador++;
            }
        }
        if (contador==2){
            System.out.println("\nEs un numero primo, su suma es equivalente a 1");
        } else {
            int sumadetectar=0;
            for(int i=1; i<m;i++){
                if(m%i==0){
                    sumadetectar+=i;
                }
            }
            if (sumadetectar<m){
                System.out.println("\nEs un numero defectivo");
            } else if (sumadetectar==m){
                System.out.println("\nEs un numero perfecto");
            } else {
                System.out.println("\nEs un numero abundante");
            }
        }
    return m;
    }

    private static int esAmigo(int n, int m){
        int sumadetectar=0;
        for (int i=1; i<n;i++){
            if (n%i==0){
                sumadetectar+=i;
            }
        }

        int sumadetectar2=0;
        for (int i=1; i<m;i++){
            if (m%i==0){
                sumadetectar2+=i;
            }
        }
        if (sumadetectar==m && sumadetectar2==n){
            System.out.println("Son numeros amigos, sus divisores dan como resultado el otro numero");
        } else {
            System.out.println("Son numeros enemigos");
        }
        return n;
    }
    private static int esMuO(int decimalN, int decimalM){
        int moduloN;
        int moduloM;
        String binarioN=" ";
        String binarioM=" ";
        int contadordetectorN=0;
        int contadordetectorM=0;
        int auxN=decimalN;
        int auxM=decimalM;
        do {
            moduloN=decimalN%2;
            if (moduloN==1){
                contadordetectorN++;
            }
            binarioN=moduloN+binarioN;
            decimalN/=2;
        }while (decimalN>0);
        System.out.println("Binario de "+auxN+": "+binarioN);
        if (contadordetectorN%2!=0){
            System.out.println("Es un numero odioso");
        } else {
            System.out.println("Es un numero malvado");
        }
        do {
            moduloM=decimalM%2;
            if (moduloM==1){
                contadordetectorM++;
            }
            binarioM=moduloM+binarioM;
            decimalM/=2;
        }while (decimalM>0);
        System.out.println("Binario de "+auxM+": "+binarioM);
        if (contadordetectorM%2!=0){
            System.out.println("Es un numero odioso");
        } else {
            System.out.println("Es un numero malvado");
        }
        return decimalN;
    }
}
