import java.time.*;

public class Main {

    public static void main(String[] args) {
        // contoh obyek data pegawai
        Pegawai p1 = new Pegawai("P01", "I Made Tangkas", 2, LocalDate.of(1961, 12, 31));
        p1.printPegawai();

        // contoh obyek data pegawai dosen
        Dosen p2 = new Dosen("P02", "Sugeng Rai", 1, LocalDate.of(1969, 3, 9), "2105551023");
        p2.printPegawai();

        // contoh obyek data pegawai nondosen
        NonDosen p3 = new NonDosen("P03", "Ida Bagus Tambi", 1, LocalDate.of(1976, 1, 29));
        p3.printPegawai();

        // contoh obyek data pegawai dosen
        Dosen p4 = new Dosen("P04", "Ketut Wija", 2, LocalDate.of(1992, 5, 17), "2105551078");
        p4.printPegawai();

        // contoh obyek data pegawai nondosen satpam
        Satpam s1 = new Satpam("S01", "Brodi", 1, LocalDate.of(1959, 6,2), "Pagi");
        s1.printSatpam();
    }

}