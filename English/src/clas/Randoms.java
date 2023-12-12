package clas;


import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random random=new Random();
        int a= random.nextInt(6)+1;
        System.out.println("You rolled a: "+a);

    }
}
