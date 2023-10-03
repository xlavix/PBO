package Multilevel;

public class Main {
    public static void main(String[] args) {
        Binatang Kambing = new Binatang("Kambing");
        Kucing mudreg = new Kucing("Mudreg");
        Cemeng Mocha = new Cemeng("Mocha");

        Kambing.bersuara();
        mudreg.bersuara();
        Mocha.bersuara();
    }
}