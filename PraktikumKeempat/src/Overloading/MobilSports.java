package Overloading;

public class MobilSports {
    private String nama;

    public MobilSports(String nama){
        this.nama = nama;
    }

    public void gigi(int g){
        System.out.println(nama + " masuk gigi ke-" + g);
    }

    public void gigi(int g, int t){
        System.out.println(nama + " masuk gigi ke-" + g + " dengan turbo " + t);
    }
}