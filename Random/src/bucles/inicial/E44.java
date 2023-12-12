package bucles.inicial;

import java.util.Random;

public class E44 {
        public static void main(String[] args) {
            int[] dorsales = new int[10];
            boolean[] dorsalesAsignados= new boolean[10];
            int[] canastas = new int[10];
            boolean[]canastasAsignadas= new boolean[100];
            int minimo=0;
            int maximo=0;
            boolean xd;
            Random random= new Random();
            for (int i=0; i<10;i++){
                int canasta= random.nextInt(100)+1;
                int dorsal= random.nextInt(10)+1;
                if (dorsalesAsignados[dorsal-1] || canastasAsignadas[canasta-1]){
                    i--;
                } else {
                    dorsales[i]=dorsal;
                    dorsalesAsignados[dorsal-1]=true;
                    canastas[i]=canasta;
                    canastasAsignadas[canasta-1]=true;
                }
            }
            System.out.println("LISTA DE JUGADORES");
            for (int i=0; i<10;i++){
                System.out.println("Jugador de dorsal " +dorsales[i]+" encestó "+canastas[i]);
            }

            int aux;
            //ORDENAMIENTO
            System.out.println("LISTA ORDENADA POR ENCESTOS");
            for (int i=0; i<10-1;i++){
                for (int j=0; j<10-1; j++){
                    do {
                        xd=false;
                        if (canastas[j]>canastas[j+1]){
                            aux=canastas[j];
                            canastas[j]=canastas[j+1];
                            canastas[j+1]=aux;
                            xd=true;
                        }
                    } while (xd);
                }
            }

            for (int i=0; i<10;i++) {
                System.out.println("Jugador de dorsal " +dorsales[i]+" encestó "+canastas[i]);
            }

            //TOP 5:
            System.out.println("TOP 5");
            for (int i=9; i>=5;i--){
                System.out.println("Jugador de dorsal " +dorsales[i]+" encestó "+canastas[i]);
            }
            //HALLAMOS EL QUE TIENE MENOS CANASTAS ENCESTADAS
            for (int i=0; i<10; i++){
                if (canastas[minimo]>canastas[i]){
                    minimo=i;
                }
            }
            System.out.println("JUGADOR CON MENOR NUMERO DE CANASTAS: "+canastas[minimo]+" de dorsal "+dorsales[minimo]);
            for (int i=0; i<10; i++){
                if (canastas[maximo]<canastas[i]){
                    maximo=i;
                }
            }
            System.out.println("JUGADOR CON MENOR NUMERO DE CANASTAS: "+canastas[maximo]+" de dorsal "+dorsales[maximo]);
        }
    }


