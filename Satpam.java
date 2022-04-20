import java.time.*;

public class Satpam extends NonDosen {
    // atribut tambahan untuk satpam
    String shift;

    // constructor
    Satpam(String id, String nama, int gol, LocalDate tgllhr, String shift){
        super(id, nama, gol, tgllhr);
        this.shift = shift;
    }

    // cetak data satpam, rincian gaji, total gaji
    void printSatpam(){
        System.out.println("\nID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Jadwal Shift : " + this.shift);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Total Gaji   : Rp " + this.hitungTotalGaji());
    }
}
