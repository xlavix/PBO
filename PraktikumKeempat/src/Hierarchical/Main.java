package Hierarchical;

public class Main {
    public static void main(String[] args) {
        Karyawan Wahyu = new Karyawan("Wahyu");
        Dosen Amir = new Dosen("Amir");
        Staff Melan = new Staff("Melan");

        Wahyu.kerja();
        Amir.kerja();
        Melan.kerja();
    }
}