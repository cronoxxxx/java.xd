package Characters;

import java.util.Random;

public class Gallina {

    private String nombre;
    private int edad;
    private float vida;
    private String nac_Gallina;

    public Gallina() {
        Random rand = new Random();
        this.edad = rand.nextInt(5) + 1;  // Edad entre 1 y 5 años
        this.nombre = "Penaldo" + rand.nextInt(1000);  // Nombre aleatorio
        this.vida = rand.nextFloat() * 10 -1;  // Vida entre 0 y 10
        this.nac_Gallina = String.format("%02d/%02d/%04d", rand.nextInt(12) + 1, rand.nextInt(28) + 1, rand.nextInt(10) + 2020);
    }

    public void ajustarVida() {
        if (0<vida && vida < 0.5) {
            System.out.println("La gallina está a punto de morir!");
        } else if (vida < 0) {
            System.out.println("La gallina ha muerto!");
            // Aquí podrías realizar acciones adicionales cuando una gallina muere
        }
    }
    public static void main(String[] args) {
        Gallina deAdrian= new Gallina();
        System.out.println("Gallina a continuacion");
        System.out.println("Gallina aleatoria a continuación:");
        System.out.println("Nombre: " + deAdrian.nombre);
        System.out.println("Edad: " + deAdrian.edad + " años");
        System.out.println("Vida: " + deAdrian.vida);
        System.out.println("Fecha de Nacimiento: " + deAdrian.nac_Gallina);
        deAdrian.ajustarVida();

    }



}
