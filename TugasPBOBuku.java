package tugaspbobuku;

public class TugasPBOBuku {

    public static void main(String[] args) {
        
        System.out.println("=== DATA BUKU ===");

        // PEMBUATAN OBJEK 1: Menggunakan Constructor 1 (Tanpa Parameter)
        Buku buku1 = new Buku();
        // Mengisi atribut manual karena pakai constructor kosong
        buku1.judul = "Laskar Pelangi";
        buku1.penulis = "Andrea Hirata";
        buku1.harga = 80000;
        
        System.out.println("Data Object 1 (Constructor Tanpa Parameter):");
        buku1.tampilkanDetail(); 

        // PEMBUATAN OBJEK 2: Menggunakan Constructor 2 (Dengan Parameter)
        Buku buku2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 100000);
        
        System.out.println("Data Object 2 (Constructor Dengan Parameter):");
        buku2.tampilkanDetail(); 

        // MEMANGGIL METHOD DENGAN NILAI BALIK
        double hargaSetelahDiskon = buku2.hitungHargaDiskon(10); 
        System.out.println("Harga '" + buku2.judul + "' setelah diskon 10%: Rp " + hargaSetelahDiskon);
    }
}