public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan Ridho = new Karyawan("12345", "Ridho");
        Karyawan Melan = new Karyawan("12346", "Melan");

        Dosen Andiani = new Dosen("23455", "332211", "Andiani");
        Dosen Ionia = new Dosen("23456", "332212", "Ionia");

        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Ridho.absenPulang();
        Melan.absenPulang();

        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.ngajar();
        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.kerja();
        Ionia.absenPulang();
        Andiani.absenPulang();
    }
}