package codelab;

public class Main {
    public static void main(String[] args) {
        Kucing cat= new Kucing();
        cat.getInfo();
        System.out.println("\n");

        Anjing dog= new Anjing();
        dog.getInfo();
        System.out.println("\n");

        Beruang bear= new Beruang();
        bear.getInfo();
        System.out.println("\n");

        Kuda horse= new Kuda();
        horse.getInfo();
    }
}
