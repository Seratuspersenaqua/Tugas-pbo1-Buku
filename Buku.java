package tugaspbobuku;

public class Buku {
    // Atribut
    String judul;
    String penulis;
    double harga;

    // CONSTRUCTOR 1: Tanpa Parameter
    public Buku() {
        this.judul = "Tidak Ada Judul";
        this.penulis = "Anonim";
        this.harga = 0.0;
    }

    // CONSTRUCTOR 2: Dengan Parameter
    public Buku(String judul, String penulis, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    // METHOD 1: Tanpa Nilai Balik (void)
    public void tampilkanDetail() {
        System.out.println("Judul Buku : " + this.judul);
        System.out.println("Penulis    : " + this.penulis);
        System.out.println("Harga      : Rp " + this.harga);
        System.out.println("---------------------------------");
    }

    // METHOD 2: Dengan Nilai Balik (return double)
    public double hitungHargaDiskon(double persenDiskon) {
        double potongan = this.harga * (persenDiskon / 100);
        return this.harga - potongan;
    }
}